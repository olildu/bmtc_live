package defpackage;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.internal.ComposableLambda;
import app.chalo.behaviour.policy.CitySelectionPolicyOverride;
import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.ble_communication.model.CityWiseTwoWayBleCommLoggingConfig;
import app.chalo.ble_communication.model.TwoWayBleCommLoggingConfigForCity$$serializer;
import app.chalo.compose.ComposableSingletons$ChaloUserReviewFormComposableKt;
import app.chalo.compose.ComposableSingletons$GenericErrorScreenWithMsgAndRetryKt;
import app.chalo.compose.components.ComposableSingletons$ChaloSnackbarKt;
import app.chalo.compose.components.ComposableSingletons$GenericScreenWithCtaKt;
import app.chalo.compose.components.buttons.ComposableSingletons$ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ComposableSingletons$ChaloConfirmationDialogKt;
import app.chalo.core.database.columnadapters.CommonColumnAdapters;
import app.chalo.core.database.columnadapters.CommonColumnAdapters$latLngColumnAdapter$2$1;
import app.chalo.core.database.columnadapters.CommonColumnAdapters$longListColumnAdapter$2$1;
import app.chalo.core.database.columnadapters.CommonColumnAdapters$paymentInfoColumnAdapter$2$1;
import app.chalo.core.database.columnadapters.CommonColumnAdapters$stringIntMapColumnAdapter$2$1;
import app.chalo.core.database.columnadapters.CommonColumnAdapters$stringListColumnAdapter$2$1;
import app.chalo.data.ClusterConfig;
import app.chalo.ncmc.data.CityWiseCardOptions;
import app.chalo.ncmc.data.apiresponsemodel.ClosedCardActivePassApiResponse$$serializer;
import app.chalo.ncmc.data.apiresponsemodel.ClosedCardInfoApiResponse;
import app.chalo.ncmc.data.appmodel.ClosedCardActivePassAppModel$$serializer;
import app.chalo.ncmc.data.appmodel.ClosedCardInfo;
import app.chalo.ncmc.ui.common.ComposableSingletons$CardRechargeTncDialogueKt;
import app.chalo.ncmc.ui.entercarddetails.compose.ComposableSingletons$EnterCardDetailsScreenKt;
import app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PbLandingScreenRouteSearchKt;
import app.chalo.ui.fragments.model.CityWiseLocationAbTestingConfig;
import app.chalo.ui.fragments.model.LocationAbTestingConfig$$serializer;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletSyncHistoryRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.QuickPayRequestApiModel$$serializer;
import io.ktor.utils.io.ByteChannel;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ep implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15575a;

    public /* synthetic */ ep(int i) {
        this.f15575a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15575a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                CitySelectionPolicyOverride.Companion companion = CitySelectionPolicyOverride.Companion;
                return new LinkedHashSetSerializer(StringSerializer.f18170a);
            case 1:
                CitySelectionPolicyOverride.Companion companion2 = CitySelectionPolicyOverride.Companion;
                return new LinkedHashSetSerializer(StringSerializer.f18170a);
            case 2:
                CitySelectionPolicyOverride.Companion companion3 = CitySelectionPolicyOverride.Companion;
                return TicketReceiptFormatConfig.INSTANCE.serializer();
            case 3:
                CityWiseCardOptions.Companion companion4 = CityWiseCardOptions.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 4:
                CityWiseLocationAbTestingConfig.Companion companion5 = CityWiseLocationAbTestingConfig.Companion;
                return new ArrayListSerializer(LocationAbTestingConfig$$serializer.f9750a);
            case 5:
                app.chalo.data.CityWiseLocationAbTestingConfig.Companion companion6 = app.chalo.data.CityWiseLocationAbTestingConfig.INSTANCE;
                return new ArrayListSerializer(app.chalo.data.LocationAbTestingConfig$$serializer.f2355a);
            case 6:
                CityWiseTwoWayBleCommLoggingConfig.Companion companion7 = CityWiseTwoWayBleCommLoggingConfig.INSTANCE;
                return new ArrayListSerializer(TwoWayBleCommLoggingConfigForCity$$serializer.f1137a);
            case 7:
                return new ByteChannel(false);
            case 8:
                ClosedCardInfo.Companion companion8 = ClosedCardInfo.Companion;
                return new ArrayListSerializer(ClosedCardActivePassAppModel$$serializer.f6141a);
            case 9:
                ClosedCardInfoApiResponse.Companion companion9 = ClosedCardInfoApiResponse.Companion;
                return new ArrayListSerializer(ClosedCardActivePassApiResponse$$serializer.f6090a);
            case 10:
                ClosedLoopWalletSyncHistoryRequestApiModel.Companion companion10 = ClosedLoopWalletSyncHistoryRequestApiModel.Companion;
                return new ArrayListSerializer(QuickPayRequestApiModel$$serializer.f10968a);
            case 11:
                ClusterConfig.Companion companion11 = ClusterConfig.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 12:
                ClusterConfig.Companion companion12 = ClusterConfig.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 13:
                return ColorSchemeKt.LocalColorScheme$lambda$1();
            case 14:
                return Boolean.valueOf(ColorSchemeKt.LocalTonalElevationEnabled$lambda$2());
            case 15:
                Lazy lazy = CommonColumnAdapters.f2048a;
                return new CommonColumnAdapters$stringListColumnAdapter$2$1();
            case 16:
                Lazy lazy2 = CommonColumnAdapters.f2048a;
                return new CommonColumnAdapters$latLngColumnAdapter$2$1();
            case 17:
                Lazy lazy3 = CommonColumnAdapters.f2048a;
                return new CommonColumnAdapters$stringIntMapColumnAdapter$2$1();
            case 18:
                Lazy lazy4 = CommonColumnAdapters.f2048a;
                return new CommonColumnAdapters$longListColumnAdapter$2$1();
            case 19:
                Lazy lazy5 = CommonColumnAdapters.f2048a;
                return new CommonColumnAdapters$paymentInfoColumnAdapter$2$1();
            case 20:
                ComposableLambda composableLambda = ComposableSingletons$CardRechargeTncDialogueKt.f6318a;
                return unit;
            case 21:
                ComposableLambda composableLambda2 = ComposableSingletons$ChaloConfirmationDialogKt.f1893a;
                return unit;
            case 22:
                ComposableLambda composableLambda3 = ComposableSingletons$ChaloFilledButtonKt.f1856a;
                return unit;
            case 23:
                ComposableLambda composableLambda4 = ComposableSingletons$ChaloSnackbarKt.f1834a;
                return unit;
            case 24:
                ComposableLambda composableLambda5 = ComposableSingletons$ChaloUserReviewFormComposableKt.f1807a;
                return unit;
            case 25:
                ComposableLambda composableLambda6 = ComposableSingletons$EnterCardDetailsScreenKt.f6337a;
                return unit;
            case 26:
                ComposableLambda composableLambda7 = ComposableSingletons$GenericErrorScreenWithMsgAndRetryKt.f1808a;
                return unit;
            case 27:
                ComposableLambda composableLambda8 = ComposableSingletons$GenericScreenWithCtaKt.f1836a;
                return unit;
            case 28:
                ComposableLambda composableLambda9 = ComposableSingletons$PbLandingScreenRouteSearchKt.f7988a;
                return unit;
            default:
                ComposableLambda composableLambda10 = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                return unit;
        }
    }
}
