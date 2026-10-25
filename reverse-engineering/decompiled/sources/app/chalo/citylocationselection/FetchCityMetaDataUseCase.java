package app.chalo.citylocationselection;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Platform;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.livetracking.utils.TrackingUtils;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.NetworkManager;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import com.adjust.sdk.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/citylocationselection/FetchCityMetaDataUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCityMetaDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkManager f1802a;
    public final ChaloUrlProvider b;
    public final BasicInfoContract c;
    public final UserProfileDetailsProvider d;
    public final ChaloBuildConfig e;
    public final LanguageFeature f;
    public final CityProvider g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/citylocationselection/FetchCityMetaDataUseCase$Companion;", "", "", "CITY_PATH_PARAM", "Ljava/lang/String;", "META_PROPS_FOR_CITY_ID_ENDPOINT", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchCityMetaDataUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, LanguageFeature languageFeature, ChaloUrlProvider chaloUrlProvider, NetworkManager networkManager, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f1802a = networkManager;
        this.b = chaloUrlProvider;
        this.c = basicInfoContract;
        this.d = userProfileDetailsProvider;
        this.e = chaloBuildConfig;
        this.f = languageFeature;
        this.g = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable] */
    public final Serializable a(ContinuationImpl continuationImpl) {
        FetchCityMetaDataUseCase$getMetadataPropsQueryParams$1 fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1;
        String str;
        Map map;
        TrackingUtils trackingUtils;
        ?? r0;
        String strName;
        if (continuationImpl instanceof FetchCityMetaDataUseCase$getMetadataPropsQueryParams$1) {
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1 = (FetchCityMetaDataUseCase$getMetadataPropsQueryParams$1) continuationImpl;
            int i = fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1 = new FetchCityMetaDataUseCase$getMetadataPropsQueryParams$1(this, continuationImpl);
            }
        } else {
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1 = new FetchCityMetaDataUseCase$getMetadataPropsQueryParams$1(this, continuationImpl);
        }
        Object obj = fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.label;
        BasicInfoContract basicInfoContract = this.c;
        if (i2 == 0) {
            ResultKt.b(obj);
            HashMap map2 = new HashMap();
            map2.put("appVer", String.valueOf(basicInfoContract.h()));
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$0 = map2;
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$1 = map2;
            str = Constants.REFERRER_API_META;
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$2 = Constants.REFERRER_API_META;
            TrackingUtils trackingUtils2 = TrackingUtils.f5112a;
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$3 = trackingUtils2;
            fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.label = 1;
            Object objK = this.d.k(fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = map2;
            trackingUtils = trackingUtils2;
            obj = objK;
            r0 = map;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackingUtils = (TrackingUtils) fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$3;
            str = (String) fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$2;
            map = (Map) fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$1;
            HashMap map3 = (HashMap) fetchCityMetaDataUseCase$getMetadataPropsQueryParams$1.L$0;
            ResultKt.b(obj);
            r0 = map3;
        }
        String str2 = (String) obj;
        String strB = CityProviderKt.b(this.g);
        String g = basicInfoContract.getG();
        String strValueOf = String.valueOf(basicInfoContract.h());
        String strValueOf2 = String.valueOf(basicInfoContract.getF());
        Language language = (Language) this.f.h().getValue();
        if (language == null || (strName = language.name()) == null) {
            strName = "ENGLISH";
        }
        String str3 = strName;
        Platform platformL = this.e.l();
        trackingUtils.getClass();
        map.put(str, String.valueOf(TrackingUtils.d(str2, strB, g, strValueOf, strValueOf2, str3, platformL)));
        return r0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r9 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citylocationselection.FetchCityMetaDataUseCase.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
