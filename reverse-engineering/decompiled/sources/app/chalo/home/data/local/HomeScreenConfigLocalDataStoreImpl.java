package app.chalo.home.data.local;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.helper.HtmlTextUIHelper;
import app.chalo.home.data.mappers.HomeScreenConfigApiToAppModelMapperKt;
import app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.utils.CommonHtmlParser;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/data/local/HomeScreenConfigLocalDataStoreImpl;", "Lapp/chalo/home/data/local/HomeScreenConfigLocalDataStore;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenConfigLocalDataStoreImpl implements HomeScreenConfigLocalDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f2872a;
    public final BasicInfoContract b;
    public final CrashlyticsLogger c;
    public final HtmlTextUIHelper d;
    public final CommonHtmlParser e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/data/local/HomeScreenConfigLocalDataStoreImpl$Companion;", "", "", "HOME_SCREEN_CONFIG_DATA_STORE_NAME", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public HomeScreenConfigLocalDataStoreImpl(LocalDataStore localDataStore, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, HtmlTextUIHelper htmlTextUIHelper, CommonHtmlParser commonHtmlParser) {
        this.f2872a = localDataStore;
        this.b = basicInfoContract;
        this.c = crashlyticsLogger;
        this.d = htmlTextUIHelper;
        this.e = commonHtmlParser;
    }

    public static Preferences.Key e(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return PreferencesKeys.stringKey(lowerCase.concat("_etag"));
    }

    @Override // app.chalo.home.data.local.HomeScreenConfigLocalDataStore
    public final Object a(String str, ContinuationImpl continuationImpl) {
        Object objC = this.f2872a.c(CollectionsKt.R(e(str)), continuationImpl);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (r3.g(r8, r9, r0) == r1) goto L27;
     */
    @Override // app.chalo.home.data.local.HomeScreenConfigLocalDataStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel r10, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl$cacheHomeScreenConfigForCity$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl$cacheHomeScreenConfigForCity$1 r0 = (app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl$cacheHomeScreenConfigForCity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl$cacheHomeScreenConfigForCity$1 r0 = new app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl$cacheHomeScreenConfigForCity$1
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.datastore.LocalDataStore r3 = r7.f2872a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r12)
            goto L93
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r12)
            goto L82
        L42:
            kotlin.ResultKt.b(r12)
            app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel$Companion r12 = app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel.INSTANCE
            kotlinx.serialization.KSerializer r12 = r12.serializer()
            kotlinx.serialization.json.Json r2 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> L54
            kotlinx.serialization.SerializationStrategy r12 = (kotlinx.serialization.SerializationStrategy) r12     // Catch: java.lang.Exception -> L54
            java.lang.String r10 = r2.a(r12, r10)     // Catch: java.lang.Exception -> L54
            goto L5b
        L54:
            r10 = move-exception
            app.chalo.crashlytics.CrashlyticsLogger r12 = r7.c
            r12.i(r10)
            r10 = r6
        L5b:
            if (r10 == 0) goto L93
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            java.lang.String r2 = "_homeScreenConfig_"
            r12.append(r2)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            androidx.datastore.preferences.core.Preferences$Key r11 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r3.g(r11, r10, r0)
            if (r10 != r1) goto L82
            goto L92
        L82:
            androidx.datastore.preferences.core.Preferences$Key r8 = e(r8)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r3.g(r8, r9, r0)
            if (r8 != r1) goto L93
        L92:
            return r1
        L93:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.data.local.HomeScreenConfigLocalDataStoreImpl.b(java.lang.String, java.lang.String, app.chalo.home.data.model.api.HomeScreenConfigFetchApiModel, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.local.HomeScreenConfigLocalDataStore
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        HomeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1 homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1;
        HomeScreenConfigFetchApiModel homeScreenConfigFetchApiModel;
        if (continuationImpl instanceof HomeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1) {
            homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1 = (HomeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1) continuationImpl;
            int i = homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1 = new HomeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1(this, continuationImpl);
            }
        } else {
            homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1 = new HomeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1(this, continuationImpl);
        }
        Object objV = homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.f2872a.e(PreferencesKeys.stringKey(str + "_homeScreenConfig_" + str2));
            homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.L$0 = str;
            homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) homeScreenConfigLocalDataStoreImpl$getCachedHomeScreenConfig$1.L$0;
            ResultKt.b(objV);
        }
        String str3 = (String) objV;
        if (str3 == null) {
            return null;
        }
        try {
            homeScreenConfigFetchApiModel = (HomeScreenConfigFetchApiModel) ChaloJson.b.b(str3, HomeScreenConfigFetchApiModel.INSTANCE.serializer());
        } catch (Exception e) {
            this.c.i(e);
            homeScreenConfigFetchApiModel = null;
        }
        if (homeScreenConfigFetchApiModel != null) {
            return HomeScreenConfigApiToAppModelMapperKt.e(homeScreenConfigFetchApiModel, str, this.b.h(), this.d, this.e);
        }
        return null;
    }

    @Override // app.chalo.home.data.local.HomeScreenConfigLocalDataStore
    public final Object d(String str, Continuation continuation) {
        return FlowKt.v(this.f2872a.e(e(str)), continuation);
    }
}
