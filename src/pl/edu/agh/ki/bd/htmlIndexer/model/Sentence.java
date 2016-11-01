package pl.edu.agh.ki.bd.htmlIndexer.model;

import java.util.Set;

public class Sentence {

	private long id;
	private String content;
	private Set<Word> words;
	private ProcessedUrl processedUrl;

	public Sentence() {
	}

	public Sentence(String content, ProcessedUrl processedUrl) {
		this.setContent(content);
		this.setProcessedUrl(processedUrl);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ProcessedUrl getProcessedUrl() {
		return processedUrl;
	}

	public void setProcessedUrl(ProcessedUrl processedUrl) {
		this.processedUrl = processedUrl;
	}

	public Set<Word> getWords() {
		return words;
	}

	public void setWords(Set<Word> words) {
		this.words = words;
	}

	public void setWords(String content) {
		String[] words = content.split("\\s+");

		for (String word : words) {
			this.words.add(new Word(word));
		}
	}

}
