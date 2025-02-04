

# CreateChatCompletionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | ID of the model to use. Currently, only &#x60;gpt-3.5-turbo&#x60; and &#x60;gpt-3.5-turbo-0301&#x60; are supported. |  |
|**messages** | [**List&lt;ChatCompletionRequestMessage&gt;**](ChatCompletionRequestMessage.md) | The messages to generate chat completions for, in the [chat format](/docs/guides/chat/introduction). |  |
|**temperature** | **BigDecimal** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  |  [optional] |
|**topP** | **BigDecimal** | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  |  [optional] |
|**n** | **Integer** | How many chat completion choices to generate for each input message. |  [optional] |
|**stream** | **Boolean** | If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message.  |  [optional] |
|**stop** | [**CreateChatCompletionRequestStop**](CreateChatCompletionRequestStop.md) |  |  [optional] |
|**maxTokens** | **Integer** | The maximum number of tokens allowed for the generated answer. By default, the number of tokens the model can return will be (4096 - prompt tokens).  |  [optional] |
|**presencePenalty** | **BigDecimal** | Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  |  [optional] |
|**frequencyPenalty** | **BigDecimal** | Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  |  [optional] |
|**logitBias** | **Object** | Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  |  [optional] |
|**user** | **String** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  |  [optional] |



