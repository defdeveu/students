private void validateUrl(String url) {
		if (url == null || url.length() == 0) {
			throw new RuntimeException("empty!");
		}
		if (!(url.startsWith("http://") || url.startsWith("https://"))) {
			throw new RuntimeException("unknown protocol!");
		}
		if (url.length() > 2000) {
			throw new RuntimeException("too long!");
		}
		if (url.contains("\\")) {
			throw new RuntimeException("invalid char!");
		}
		String pattern = "(http|https):\\/\\/[A-Za-z0-9_-~\\.]*";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(url);
		if (!m.matches()) {
			throw new RuntimeException("invalid url!");
		}
	}
