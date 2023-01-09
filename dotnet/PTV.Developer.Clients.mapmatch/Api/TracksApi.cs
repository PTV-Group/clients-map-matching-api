/*
 * Map Matching
 *
 * With the Map Matching service you can assign GPS positions to road segments on a digital map.
 *
 * The version of the OpenAPI document: 1.3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using PTV.Developer.Clients.mapmatch.Client;
using PTV.Developer.Clients.mapmatch.Model;

namespace PTV.Developer.Clients.mapmatch.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITracksApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a complete track by triggering a matching calculation for it.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <returns>MatchedTrackIdentifier</returns>
        MatchedTrackIdentifier CreateMatchedTrack(Track track, CalculationMode? calculationMode = default(CalculationMode?));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a complete track by triggering a matching calculation for it.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <returns>ApiResponse of MatchedTrackIdentifier</returns>
        ApiResponse<MatchedTrackIdentifier> CreateMatchedTrackWithHttpInfo(Track track, CalculationMode? calculationMode = default(CalculationMode?));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Deletes a matched track specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <returns></returns>
        void DeleteMatchedTrack(Guid id);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Deletes a matched track specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteMatchedTrackWithHttpInfo(Guid id);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Gets the results of a matching calculation specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <returns>MatchingResponse</returns>
        MatchingResponse GetMatchedTrack(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Gets the results of a matching calculation specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <returns>ApiResponse of MatchingResponse</returns>
        ApiResponse<MatchingResponse> GetMatchedTrackWithHttpInfo(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>));
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITracksApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a complete track by triggering a matching calculation for it.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of MatchedTrackIdentifier</returns>
        System.Threading.Tasks.Task<MatchedTrackIdentifier> CreateMatchedTrackAsync(Track track, CalculationMode? calculationMode = default(CalculationMode?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Creates a complete track by triggering a matching calculation for it.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (MatchedTrackIdentifier)</returns>
        System.Threading.Tasks.Task<ApiResponse<MatchedTrackIdentifier>> CreateMatchedTrackWithHttpInfoAsync(Track track, CalculationMode? calculationMode = default(CalculationMode?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Deletes a matched track specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteMatchedTrackAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Deletes a matched track specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteMatchedTrackWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Gets the results of a matching calculation specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of MatchingResponse</returns>
        System.Threading.Tasks.Task<MatchingResponse> GetMatchedTrackAsync(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Gets the results of a matching calculation specified by its ID.
        /// </remarks>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (MatchingResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<MatchingResponse>> GetMatchedTrackWithHttpInfoAsync(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITracksApi : ITracksApiSync, ITracksApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class TracksApi : ITracksApi
    {
        private PTV.Developer.Clients.mapmatch.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TracksApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TracksApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TracksApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TracksApi(string basePath)
        {
            this.Configuration = PTV.Developer.Clients.mapmatch.Client.Configuration.MergeConfigurations(
                PTV.Developer.Clients.mapmatch.Client.GlobalConfiguration.Instance,
                new PTV.Developer.Clients.mapmatch.Client.Configuration { BasePath = basePath }
            );
            this.Client = new PTV.Developer.Clients.mapmatch.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new PTV.Developer.Clients.mapmatch.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = PTV.Developer.Clients.mapmatch.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TracksApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TracksApi(PTV.Developer.Clients.mapmatch.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = PTV.Developer.Clients.mapmatch.Client.Configuration.MergeConfigurations(
                PTV.Developer.Clients.mapmatch.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new PTV.Developer.Clients.mapmatch.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new PTV.Developer.Clients.mapmatch.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = PTV.Developer.Clients.mapmatch.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TracksApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public TracksApi(PTV.Developer.Clients.mapmatch.Client.ISynchronousClient client, PTV.Developer.Clients.mapmatch.Client.IAsynchronousClient asyncClient, PTV.Developer.Clients.mapmatch.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = PTV.Developer.Clients.mapmatch.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public PTV.Developer.Clients.mapmatch.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public PTV.Developer.Clients.mapmatch.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public PTV.Developer.Clients.mapmatch.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public PTV.Developer.Clients.mapmatch.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        ///  Creates a complete track by triggering a matching calculation for it.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <returns>MatchedTrackIdentifier</returns>
        public MatchedTrackIdentifier CreateMatchedTrack(Track track, CalculationMode? calculationMode = default(CalculationMode?))
        {
            PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchedTrackIdentifier> localVarResponse = CreateMatchedTrackWithHttpInfo(track, calculationMode);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Creates a complete track by triggering a matching calculation for it.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <returns>ApiResponse of MatchedTrackIdentifier</returns>
        public PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchedTrackIdentifier> CreateMatchedTrackWithHttpInfo(Track track, CalculationMode? calculationMode = default(CalculationMode?))
        {
            // verify the required parameter 'track' is set
            if (track == null)
            {
                throw new PTV.Developer.Clients.mapmatch.Client.ApiException(400, "Missing required parameter 'track' when calling TracksApi->CreateMatchedTrack");
            }

            PTV.Developer.Clients.mapmatch.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.mapmatch.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (calculationMode != null)
            {
                localVarRequestOptions.QueryParameters.Add(PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToMultiMap("", "calculationMode", calculationMode));
            }
            localVarRequestOptions.Data = track;

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Post<MatchedTrackIdentifier>("/tracks", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateMatchedTrack", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Creates a complete track by triggering a matching calculation for it.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of MatchedTrackIdentifier</returns>
        public async System.Threading.Tasks.Task<MatchedTrackIdentifier> CreateMatchedTrackAsync(Track track, CalculationMode? calculationMode = default(CalculationMode?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchedTrackIdentifier> localVarResponse = await CreateMatchedTrackWithHttpInfoAsync(track, calculationMode, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Creates a complete track by triggering a matching calculation for it.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="track"></param>
        /// <param name="calculationMode">The calculationMode affects the quality and performance of the matching. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (MatchedTrackIdentifier)</returns>
        public async System.Threading.Tasks.Task<PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchedTrackIdentifier>> CreateMatchedTrackWithHttpInfoAsync(Track track, CalculationMode? calculationMode = default(CalculationMode?), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'track' is set
            if (track == null)
            {
                throw new PTV.Developer.Clients.mapmatch.Client.ApiException(400, "Missing required parameter 'track' when calling TracksApi->CreateMatchedTrack");
            }


            PTV.Developer.Clients.mapmatch.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.mapmatch.Client.RequestOptions();

            string[] _contentTypes = new string[] {
                "application/json"
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            if (calculationMode != null)
            {
                localVarRequestOptions.QueryParameters.Add(PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToMultiMap("", "calculationMode", calculationMode));
            }
            localVarRequestOptions.Data = track;

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.PostAsync<MatchedTrackIdentifier>("/tracks", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("CreateMatchedTrack", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Deletes a matched track specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <returns></returns>
        public void DeleteMatchedTrack(Guid id)
        {
            DeleteMatchedTrackWithHttpInfo(id);
        }

        /// <summary>
        ///  Deletes a matched track specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public PTV.Developer.Clients.mapmatch.Client.ApiResponse<Object> DeleteMatchedTrackWithHttpInfo(Guid id)
        {
            PTV.Developer.Clients.mapmatch.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.mapmatch.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Delete<Object>("/tracks/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DeleteMatchedTrack", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Deletes a matched track specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteMatchedTrackAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            await DeleteMatchedTrackWithHttpInfoAsync(id, cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        ///  Deletes a matched track specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<PTV.Developer.Clients.mapmatch.Client.ApiResponse<Object>> DeleteMatchedTrackWithHttpInfoAsync(Guid id, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            PTV.Developer.Clients.mapmatch.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.mapmatch.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToString(id)); // path parameter

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.DeleteAsync<Object>("/tracks/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("DeleteMatchedTrack", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Gets the results of a matching calculation specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <returns>MatchingResponse</returns>
        public MatchingResponse GetMatchedTrack(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>))
        {
            PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchingResponse> localVarResponse = GetMatchedTrackWithHttpInfo(id, results);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Gets the results of a matching calculation specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <returns>ApiResponse of MatchingResponse</returns>
        public PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchingResponse> GetMatchedTrackWithHttpInfo(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>))
        {
            PTV.Developer.Clients.mapmatch.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.mapmatch.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToString(id)); // path parameter
            if (results != null)
            {
                localVarRequestOptions.QueryParameters.Add(PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToMultiMap("csv", "results", results));
            }

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = this.Client.Get<MatchingResponse>("/tracks/{id}", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetMatchedTrack", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        ///  Gets the results of a matching calculation specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of MatchingResponse</returns>
        public async System.Threading.Tasks.Task<MatchingResponse> GetMatchedTrackAsync(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchingResponse> localVarResponse = await GetMatchedTrackWithHttpInfoAsync(id, results, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  Gets the results of a matching calculation specified by its ID.
        /// </summary>
        /// <exception cref="PTV.Developer.Clients.mapmatch.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="id">The ID of the MatchedTrack.</param>
        /// <param name="results">Selects which properties the MatchedTrack will contain. (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (MatchingResponse)</returns>
        public async System.Threading.Tasks.Task<PTV.Developer.Clients.mapmatch.Client.ApiResponse<MatchingResponse>> GetMatchedTrackWithHttpInfoAsync(Guid id, List<MatchedTrackResultType> results = default(List<MatchedTrackResultType>), System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            PTV.Developer.Clients.mapmatch.Client.RequestOptions localVarRequestOptions = new PTV.Developer.Clients.mapmatch.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = PTV.Developer.Clients.mapmatch.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("id", PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToString(id)); // path parameter
            if (results != null)
            {
                localVarRequestOptions.QueryParameters.Add(PTV.Developer.Clients.mapmatch.Client.ClientUtils.ParameterToMultiMap("csv", "results", results));
            }

            // authentication (apiKeyAuth) required
            if (!string.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("apiKey")))
            {
                localVarRequestOptions.HeaderParameters.Add("apiKey", this.Configuration.GetApiKeyWithPrefix("apiKey"));
            }

            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<MatchingResponse>("/tracks/{id}", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetMatchedTrack", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}
