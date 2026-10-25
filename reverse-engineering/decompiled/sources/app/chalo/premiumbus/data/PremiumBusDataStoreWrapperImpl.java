package app.chalo.premiumbus.data;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/data/PremiumBusDataStoreWrapperImpl;", "Lapp/chalo/premiumbus/data/PremiumBusDataStoreWrapper;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusDataStoreWrapperImpl implements PremiumBusDataStoreWrapper {
    public static final Preferences.Key b = PreferencesKeys.booleanKey("is_airport_first_ride_event_triggered");
    public static final Preferences.Key c = PreferencesKeys.booleanKey("is_non_airport_first_ride_event_triggered");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f6958a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/data/PremiumBusDataStoreWrapperImpl$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "IS_AIRPORT_FIRST_RIDE_EVENT_ALREADY_TRIGGERED", "Landroidx/datastore/preferences/core/Preferences$Key;", "IS_NON_AIRPORT_FIRST_RIDE_EVENT_ALREADY_TRIGGERED", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PremiumBusDataStoreWrapperImpl(LocalDataStore localDataStore) {
        this.f6958a = localDataStore;
    }

    public static Preferences.Key l(String str) {
        return PreferencesKeys.longKey("premium_pass_saving_".concat(str));
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final Object a(GenderPreferenceSelectionStates state, String str, SuspendLambda suspendLambda) {
        Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey("gender_preference_selection_bottom_sheet_shown_" + str);
        GenderPreferenceSelectionStates.INSTANCE.getClass();
        Intrinsics.i(state, "state");
        Object objG = this.f6958a.g(keyStringKey, state.getValue(), suspendLambda);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 b(String str) {
        return this.f6958a.e(PreferencesKeys.booleanKey("clear_women_seat_change_when_trip_system_rescheduled_banner_" + str));
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final Object c(String str, Continuation continuation) {
        if (str == null) {
            str = "";
        }
        Object objC = this.f6958a.c(CollectionsKt.S(b, c, l(str)), (ContinuationImpl) continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final Object d(ContinuationImpl continuationImpl) {
        Object objG = this.f6958a.g(b, Boolean.TRUE, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 e() {
        return this.f6958a.e(b);
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final Object f(long j, String str, Continuation continuation) {
        Object objG = this.f6958a.g(l(str), new Long(j), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final Object g(ContinuationImpl continuationImpl) {
        Object objG = this.f6958a.g(c, Boolean.TRUE, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 h(String str) {
        return this.f6958a.e(l(str));
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 i() {
        return this.f6958a.e(c);
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final PremiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1 j(String userId) {
        Intrinsics.i(userId, "userId");
        return new PremiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1(this.f6958a.e(PreferencesKeys.stringKey("gender_preference_selection_bottom_sheet_shown_".concat(userId))));
    }

    @Override // app.chalo.premiumbus.data.PremiumBusDataStoreWrapper
    public final Object k(String str, Continuation continuation) {
        Object objG = this.f6958a.g(PreferencesKeys.booleanKey("clear_women_seat_change_when_trip_system_rescheduled_banner_" + str), Boolean.TRUE, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
