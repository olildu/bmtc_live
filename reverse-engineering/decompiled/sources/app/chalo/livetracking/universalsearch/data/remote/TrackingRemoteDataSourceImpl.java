package app.chalo.livetracking.universalsearch.data.remote;

import app.chalo.network.NetworkManager;
import app.chalo.network.mapper.GenericNetworkExceptionMapper;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/remote/TrackingRemoteDataSourceImpl;", "Lapp/chalo/livetracking/universalsearch/data/remote/TrackingRemoteDataSource;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackingRemoteDataSourceImpl implements TrackingRemoteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f5007a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/remote/TrackingRemoteDataSourceImpl$Companion;", "", "", "COUNTRY_ID", "Ljava/lang/String;", "CITY_ID", "SEARCH_FLOW_HEADER", "ONDC_SUGGEST", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TrackingRemoteDataSourceImpl(NetworkManager networkManager, GenericNetworkExceptionMapper genericNetworkExceptionMapper, StringProvider stringProvider) {
        this.f5007a = networkManager;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.LinkedHashMap r7, int r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl.a(java.util.LinkedHashMap, int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r8 == r1) goto L33;
     */
    @Override // app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.LinkedHashMap r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl$fetchLatLngFromPlace$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl$fetchLatLngFromPlace$1 r0 = (app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl$fetchLatLngFromPlace$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl$fetchLatLngFromPlace$1 r0 = new app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl$fetchLatLngFromPlace$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L2f
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            java.lang.Object r7 = r0.L$0
            app.chalo.network.rest.response.NetworkResponse r7 = (app.chalo.network.rest.response.NetworkResponse) r7
            kotlin.ResultKt.b(r8)
            goto Lb5
        L38:
            kotlin.ResultKt.b(r8)
            goto L60
        L3c:
            kotlin.ResultKt.b(r8)
            app.chalo.network.NetworkManager r8 = r6.f5007a
            app.chalo.network.rest.request.NetworkRequestBuilder r8 = r8.d()
            java.lang.String r2 = "scheduler_v4/v5/place/details"
            r8.j(r2)
            r8.h(r7)
            app.chalo.network.rest.request.HttpRequestType r7 = app.chalo.network.rest.request.HttpRequestType.GET
            r8.f(r7)
            app.chalo.network.rest.request.ChaloRequest r7 = r8.e()
            r0.label = r5
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r1) goto L60
            goto Lb4
        L60:
            r7 = r8
            app.chalo.network.rest.response.NetworkResponse r7 = (app.chalo.network.rest.response.NetworkResponse) r7
            boolean r8 = r7.f6522a
            java.lang.String r2 = r7.c
            if (r8 == 0) goto La3
            kotlinx.serialization.json.Json r8 = app.chalo.network.config.ChaloJson.b
            app.chalo.network.exception.NetworkSuccessResponseParseException r0 = new app.chalo.network.exception.NetworkSuccessResponseParseException
            java.lang.String r1 = "Response json is either null or empty"
            r0.<init>(r1)
            if (r2 == 0) goto L9d
            r8.getClass()     // Catch: java.lang.Exception -> L88
            app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng$Companion r1 = app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng.INSTANCE     // Catch: java.lang.Exception -> L88
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Exception -> L88
            kotlinx.serialization.KSerializer r1 = kotlinx.serialization.builtins.BuiltinSerializersKt.c(r1)     // Catch: java.lang.Exception -> L88
            kotlinx.serialization.DeserializationStrategy r1 = (kotlinx.serialization.DeserializationStrategy) r1     // Catch: java.lang.Exception -> L88
            java.lang.Object r3 = r8.b(r2, r1)     // Catch: java.lang.Exception -> L88
            goto L9d
        L88:
            r8 = move-exception
            app.chalo.network.exception.NetworkSuccessResponseParseException r0 = new app.chalo.network.exception.NetworkSuccessResponseParseException
            java.lang.String r8 = r8.getMessage()
            java.lang.Class<app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng> r1 = app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng.class
            java.lang.String r8 = defpackage.t8.g(r1, r8, r2)
            r0.<init>(r8)
            app.chalo.network.NetworkCrashlyticsLogger r7 = r7.g
            r7.b(r0)
        L9d:
            if (r3 == 0) goto La2
            app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng r3 = (app.chalo.livetracking.universalsearch.data.model.api.PlaceWithLatLng) r3
            return r3
        La2:
            throw r0
        La3:
            app.chalo.providers.stringprovider.StringEnum r8 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.L$0 = r7
            r0.label = r4
            app.chalo.providers.stringprovider.StringProvider r4 = r6.b
            java.lang.Object r8 = r4.b(r8, r2, r0)
            if (r8 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            java.lang.String r8 = (java.lang.String) r8
            f31 r0 = new f31
            r1 = 24
            r0.<init>(r8, r1)
            java.lang.Exception r7 = app.chalo.network.mapper.GenericNetworkExceptionMapper.a(r7, r3, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl.b(java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r11 == r1) goto L33;
     */
    @Override // app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.LinkedHashMap r7, java.lang.String r8, int r9, app.chalo.livetracking.universalsearch.data.enums.SearchFlowSourceType r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl.c(java.util.LinkedHashMap, java.lang.String, int, app.chalo.livetracking.universalsearch.data.enums.SearchFlowSourceType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        if (r12 == r1) goto L33;
     */
    @Override // app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.LinkedHashMap r8, java.lang.String r9, int r10, app.chalo.livetracking.universalsearch.data.enums.SearchFlowSourceType r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.data.remote.TrackingRemoteDataSourceImpl.d(java.util.LinkedHashMap, java.lang.String, int, app.chalo.livetracking.universalsearch.data.enums.SearchFlowSourceType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
