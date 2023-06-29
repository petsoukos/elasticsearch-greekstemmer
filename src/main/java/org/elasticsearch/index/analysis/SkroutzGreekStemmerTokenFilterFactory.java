package org.elasticsearch.index.analysis;

import java.io.IOException;

import org.apache.lucene.analysis.TokenStream;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;

/**
 * Factory class for creating instances of the Skroutz Greek Stemmer token filter.
 * Extends AbstractTokenFilterFactory to integrate with Elasticsearch's token filter framework.
 */
public class SkroutzGreekStemmerTokenFilterFactory extends AbstractTokenFilterFactory {

	/**
     * Constructs a new SkroutzGreekStemmerTokenFilterFactory.
     *
     * @param indexSettings The index settings
     * @param env           The environment
     * @param name          The name of the token filter
     * @param settings      The settings for the token filter
     * @throws IOException If an I/O error occurs
     */
	@Inject
	public SkroutzGreekStemmerTokenFilterFactory(IndexSettings indexSettings, Environment env, String name, Settings settings) throws IOException {
		super(name, settings);
	}

	@Override
	public TokenStream create(TokenStream tokenStream) {
		return new SkroutzGreekStemTokenFilter(tokenStream);
	}
}