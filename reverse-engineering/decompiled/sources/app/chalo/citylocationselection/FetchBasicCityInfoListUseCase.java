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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/citylocationselection/FetchBasicCityInfoListUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchBasicCityInfoListUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f1801a;
    public final NetworkManager b;
    public final ChaloUrlProvider c;
    public final UserProfileDetailsProvider d;
    public final ChaloBuildConfig e;
    public final LanguageFeature f;
    public final CityProvider g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/citylocationselection/FetchBasicCityInfoListUseCase$Companion;", "", "", "BASIC_CITY_INFO_LIST_ENDPOINT", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FetchBasicCityInfoListUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, LanguageFeature languageFeature, ChaloUrlProvider chaloUrlProvider, NetworkManager networkManager, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f1801a = basicInfoContract;
        this.b = networkManager;
        this.c = chaloUrlProvider;
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
        FetchBasicCityInfoListUseCase$getQueryParams$1 fetchBasicCityInfoListUseCase$getQueryParams$1;
        String str;
        Map map;
        TrackingUtils trackingUtils;
        ?? r0;
        String strName;
        if (continuationImpl instanceof FetchBasicCityInfoListUseCase$getQueryParams$1) {
            fetchBasicCityInfoListUseCase$getQueryParams$1 = (FetchBasicCityInfoListUseCase$getQueryParams$1) continuationImpl;
            int i = fetchBasicCityInfoListUseCase$getQueryParams$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchBasicCityInfoListUseCase$getQueryParams$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchBasicCityInfoListUseCase$getQueryParams$1 = new FetchBasicCityInfoListUseCase$getQueryParams$1(this, continuationImpl);
            }
        } else {
            fetchBasicCityInfoListUseCase$getQueryParams$1 = new FetchBasicCityInfoListUseCase$getQueryParams$1(this, continuationImpl);
        }
        Object obj = fetchBasicCityInfoListUseCase$getQueryParams$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchBasicCityInfoListUseCase$getQueryParams$1.label;
        BasicInfoContract basicInfoContract = this.f1801a;
        if (i2 == 0) {
            ResultKt.b(obj);
            HashMap map2 = new HashMap();
            map2.put("appVer", String.valueOf(basicInfoContract.h()));
            fetchBasicCityInfoListUseCase$getQueryParams$1.L$0 = map2;
            fetchBasicCityInfoListUseCase$getQueryParams$1.L$1 = map2;
            str = Constants.REFERRER_API_META;
            fetchBasicCityInfoListUseCase$getQueryParams$1.L$2 = Constants.REFERRER_API_META;
            TrackingUtils trackingUtils2 = TrackingUtils.f5112a;
            fetchBasicCityInfoListUseCase$getQueryParams$1.L$3 = trackingUtils2;
            fetchBasicCityInfoListUseCase$getQueryParams$1.label = 1;
            Object objK = this.d.k(fetchBasicCityInfoListUseCase$getQueryParams$1);
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
            trackingUtils = (TrackingUtils) fetchBasicCityInfoListUseCase$getQueryParams$1.L$3;
            str = (String) fetchBasicCityInfoListUseCase$getQueryParams$1.L$2;
            map = (Map) fetchBasicCityInfoListUseCase$getQueryParams$1.L$1;
            HashMap map3 = (HashMap) fetchBasicCityInfoListUseCase$getQueryParams$1.L$0;
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
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.citylocationselection.FetchBasicCityInfoListUseCase.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
