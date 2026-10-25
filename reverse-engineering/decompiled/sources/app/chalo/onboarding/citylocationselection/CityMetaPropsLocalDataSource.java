package app.chalo.onboarding.citylocationselection;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/CityMetaPropsLocalDataSource;", "", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityMetaPropsLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f6565a;
    public final DataStore b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/CityMetaPropsLocalDataSource$Companion;", "", "", "OLD_CITY_STORE_PREFS", "Ljava/lang/String;", "NEW_CITY_STORE_PREFS", "CITY_STORE_DATASTORE", "KEY_CITY_META_PROPS", "KEY_CURRENT_CITY_NAME", "KEY_BASIC_CITY_INFO_LIST", "KEY_IS_META_UPDATED", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CityMetaPropsLocalDataSource(CoroutineContextProvider coroutineContextProvider, DataStore dataStore) {
        this.f6565a = coroutineContextProvider;
        this.b = dataStore;
    }

    public final Object a(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.b, new CityMetaPropsLocalDataSource$markAsSelectedCity$2(str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    public final Object b(String str, Continuation continuation) {
        return BuildersKt.g(this.f6565a.getDefault(), new CityMetaPropsLocalDataSource$updateBasicCityInfoCacheIfPossible$2(str, this, null), continuation);
    }

    public final Object c(String str, String str2, String str3, Continuation continuation) {
        return BuildersKt.g(this.f6565a.getDefault(), new CityMetaPropsLocalDataSource$updateCityMetaDataCacheIfPossible$2(str2, this, str, str3, null), continuation);
    }

    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.b, new CityMetaPropsLocalDataSource$write$2(str, str2, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }
}
