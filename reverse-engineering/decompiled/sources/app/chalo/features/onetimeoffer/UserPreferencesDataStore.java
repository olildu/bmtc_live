package app.chalo.features.onetimeoffer;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.extensions.DataStoreExtensionsKt;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/onetimeoffer/UserPreferencesDataStore;", "Lapp/chalo/features/onetimeoffer/IUserPreferencesDataStore;", "PreferencesKeys", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserPreferencesDataStore implements IUserPreferencesDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f2737a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/onetimeoffer/UserPreferencesDataStore$PreferencesKeys;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PreferencesKeys {
        public static Preferences.Key a(String str, String str2, String productConfigId) {
            Intrinsics.i(productConfigId, "productConfigId");
            return androidx.datastore.preferences.core.PreferencesKeys.booleanKey("has_user_availed_offer_" + str + "_" + str2 + "_" + productConfigId);
        }
    }

    public UserPreferencesDataStore(DataStore dataStore, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f2737a = dataStore;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    @Override // app.chalo.features.onetimeoffer.IUserPreferencesDataStore
    public final Flow a(String productConfigId) {
        String str;
        Intrinsics.i(productConfigId, "productConfigId");
        if (!h()) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(Boolean.FALSE);
        }
        String strG = g();
        CityAppModel cityAppModel = (CityAppModel) this.c.getE().getValue();
        if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return DataStoreExtensionsKt.a(this.f2737a, PreferencesKeys.a(strG, lowerCase, productConfigId), Boolean.FALSE);
    }

    @Override // app.chalo.features.onetimeoffer.IUserPreferencesDataStore
    public final DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 b() {
        return DataStoreExtensionsKt.a(this.f2737a, androidx.datastore.preferences.core.PreferencesKeys.stringKey("adjust_acquisition_channel".concat(g())), "");
    }

    @Override // app.chalo.features.onetimeoffer.IUserPreferencesDataStore
    public final Object c(String str, ContinuationImpl continuationImpl) {
        String str2;
        if (h()) {
            String strG = g();
            CityAppModel cityAppModel = (CityAppModel) this.c.getE().getValue();
            if (cityAppModel == null || (str2 = cityAppModel.f8854a) == null) {
                str2 = "";
            }
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            Object objB = DataStoreExtensionsKt.b(this.f2737a, PreferencesKeys.a(strG, lowerCase, str), Boolean.TRUE, continuationImpl);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.features.onetimeoffer.IUserPreferencesDataStore
    public final DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 d() {
        return DataStoreExtensionsKt.a(this.f2737a, androidx.datastore.preferences.core.PreferencesKeys.stringKey("adjust_campaign_name".concat(g())), "");
    }

    @Override // app.chalo.features.onetimeoffer.IUserPreferencesDataStore
    public final Object e(String str, Continuation continuation) {
        if (h()) {
            Object objB = DataStoreExtensionsKt.b(this.f2737a, androidx.datastore.preferences.core.PreferencesKeys.stringKey("adjust_acquisition_channel".concat(g())), str, (ContinuationImpl) continuation);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.features.onetimeoffer.IUserPreferencesDataStore
    public final Object f(String str, ContinuationImpl continuationImpl) {
        if (h()) {
            Object objB = DataStoreExtensionsKt.b(this.f2737a, androidx.datastore.preferences.core.PreferencesKeys.stringKey("adjust_campaign_name".concat(g())), str, continuationImpl);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        }
        return Unit.f17538a;
    }

    public final String g() {
        String strM = this.b.m();
        return strM == null ? "" : strM;
    }

    public final boolean h() {
        return ((Boolean) this.b.getG().getValue()).booleanValue();
    }
}
