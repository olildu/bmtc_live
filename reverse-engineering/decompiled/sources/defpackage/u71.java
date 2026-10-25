package defpackage;

import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.domain.ValidateChaloTimeCacheUseCase;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.mTicketing.validation.MTicketProductValidationConfig;
import app.chalo.metro.validation.MetroTicketProductValidationConfig;
import app.chalo.ondc.validation.OndcTicketProductValidationConfig;
import app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationConfig;
import app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationConfig;
import app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig;
import app.chalo.utils.DataStorePathHelper;
import app.chalo.validation.instantticket.InstantTicketProductValidationConfig;
import app.chalo.validation.superpass.SuperPassProductValidationConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u71 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19720a;
    public final /* synthetic */ Scope b;

    public /* synthetic */ u71(Scope scope, int i) {
        this.f19720a = i;
        this.b = scope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19720a) {
            case 0:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "ENV_CHANGE_STORE_KEY.preferences_pb");
            case 1:
                return (ChaloConfigFeature) this.b.d(Reflection.a(ChaloConfigFeature.class), null, null);
            case 2:
                return (ValidateChaloTimeCacheUseCase) this.b.d(Reflection.a(ValidateChaloTimeCacheUseCase.class), null, null);
            case 3:
                return (WalletSyncHelper) this.b.d(Reflection.a(WalletSyncHelper.class), null, null);
            case 4:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "recents_and_fav_data_store_migration_tracker.preferences_pb");
            case 5:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "keyCityData.preferences_pb");
            case 6:
                return (OndcMetroTicketProductValidationConfig) this.b.d(Reflection.a(OndcMetroTicketProductValidationConfig.class), null, null);
            case 7:
                return (SuperPassProductValidationConfig) this.b.d(Reflection.a(SuperPassProductValidationConfig.class), null, null);
            case 8:
                return (MTicketProductValidationConfig) this.b.d(Reflection.a(MTicketProductValidationConfig.class), null, null);
            case 9:
                return (PremiumReserveTicketValidationConfig) this.b.d(Reflection.a(PremiumReserveTicketValidationConfig.class), null, null);
            case 10:
                return (OndcTicketProductValidationConfig) this.b.d(Reflection.a(OndcTicketProductValidationConfig.class), null, null);
            case 11:
                return (MetroTicketProductValidationConfig) this.b.d(Reflection.a(MetroTicketProductValidationConfig.class), null, null);
            case 12:
                return (QuickPayTicketProductValidationConfig) this.b.d(Reflection.a(QuickPayTicketProductValidationConfig.class), null, null);
            case 13:
                return (InstantTicketProductValidationConfig) this.b.d(Reflection.a(InstantTicketProductValidationConfig.class), null, null);
            case 14:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "isTermsAndConditionSeenKey");
            case 15:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "superPassActivationTimestampsMap.preferences_pb");
            case 16:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "keyWorkerStore.preferences_pb");
            case 17:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "city_store.preferences_pb");
            case 18:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "sos_store_key.preferences_pb");
            case 19:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "pass_status_store.preferences_pb");
            case 20:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "keyTITOFirstTimeUser.preferences_pb");
            case 21:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "homeScreenConfigDataStoreKey.preferences_pb");
            case 22:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "pb_user_profile_survey_store.preferences_pb");
            case 23:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "routeAvailabilityBanner.preferences_pb");
            case 24:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "keyRouteDetails.preferences_pb");
            case 25:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "livetracking_config.preferences_pb");
            case 26:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "user_details_datastore.preferences_pb");
            case 27:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "user_profiling_rule_engine.preferences_pb");
            case 28:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "app_open_daily_store.preferences_pb");
            default:
                return DataStorePathHelper.a(ModuleExtKt.a(this.b), "ride_hailing_store.preferences_pb");
        }
    }
}
