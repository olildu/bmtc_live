package defpackage;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.ToggleableAppBarItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.chalo.checkout.ui.screen.upi.NoUpiAppsErrorUiState;
import app.chalo.checkout.ui.screen.upi.compose.UpiAppScreenKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TextWithFilledLeadingIconKt;
import app.chalo.compose.components.bottomsheet.TncBottomSheetKt;
import app.chalo.compose.components.dialogs.TncDialogUIKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.electricitybill.ui.base.TransactionInfoViewKt;
import app.chalo.electricitybill.ui.uistate.TransactionInfoUIState;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.home.ui.history.compose.components.TabHeaderUiStateViewKt;
import app.chalo.home.ui.history.uistate.ChaloCitySelectedContainerUiState;
import app.chalo.home.ui.history.uistate.tabheader.TabHeaderUiState;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsMetroLegCardKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultDialogType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofItemsUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofRejectionImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofRejectionReasonUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofUploadedImageUIState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassProofTutorialUIState;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadScreenKt;
import app.chalo.productsummary.ui.compose.TripSummaryMainScreenKt;
import app.chalo.productsummary.ui.data.RouteDetailInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketInfoUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptCardUISpec;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptCardUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptTotalFareUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.titoridedetail.ui.compose.TitoStopInfoWindowKt;
import app.chalo.uistate.bottomsheet.TncBottomSheetUIState;
import app.chalo.uistate.components.TextWithFilledTrailingIconUIState;
import app.chalo.uistate.dialog.TermTextUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.FlowTextUIState;
import app.chalo.uistate.text.TextUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cg1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11283a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cg1(int i, int i2, Modifier modifier, Object obj) {
        this.f11283a = i2;
        this.b = modifier;
        this.d = obj;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11283a) {
            case 0:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.a((SuperPassProofItemsUIState.ImageProof) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.k((SuperPassProofRejectionReasonUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.b((SuperPassProofUploadedImageUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                SuperPassProofOverviewScreenKt.j((SuperPassProofRejectionImageUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 4:
                ((Integer) obj2).getClass();
                SuperPassUserProofUploadScreenKt.a((SuperPassProofTutorialUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).intValue();
                TabHeaderKt.e((List) this.d, (Function2) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).getClass();
                TabHeaderUiStateViewKt.d((Modifier) this.b, (TabHeaderUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 7:
                ((Integer) obj2).getClass();
                TabHeaderUiStateViewKt.a((Modifier) this.b, (ChaloCitySelectedContainerUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 8:
                ((Integer) obj2).getClass();
                TextKt.a((FlowTextUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 9:
                return androidx.compose.material3.TextKt.ProvideTextStyle$lambda$20((TextStyle) this.d, (Function2) this.b, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                ((Integer) obj2).getClass();
                TextWithFilledLeadingIconKt.a((Modifier) this.b, (TextWithFilledTrailingIconUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                TitoStopInfoWindowKt.a((Modifier) this.b, (StopLiveEtaUiModel) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).intValue();
                TncBottomSheetKt.a((TncBottomSheetUIState) this.d, (SheetState) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).getClass();
                TncDialogUIKt.b((TermTextUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 14:
                return ToggleableAppBarItem.MenuContent$lambda$3((ToggleableAppBarItem) this.d, (AppBarMenuState) this.b, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                ((Integer) obj2).getClass();
                TransactionInfoViewKt.a((Modifier) this.b, (TransactionInfoUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 16:
                return Transition.animateTo$lambda$3((Transition) this.d, this.b, this.c, (Composer) obj, ((Integer) obj2).intValue());
            case 17:
                Function1 function1 = (Function1) this.d;
                TripPlannerLegUiModel.Metro metro = (TripPlannerLegUiModel.Metro) this.b;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1474536754, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsMetroLegSection.<anonymous> (TripPlannerDetailsScreen.kt:687)");
                    }
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 11, null);
                    int i = this.c;
                    TripPlannerDetailsMetroLegCardKt.a(function1, metro, i, pk0.d("PL_Trip_Itinerary_Leg_", i, modifierM788paddingqDBjuR0$default), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).intValue();
                TripPlannerDetailsScreenKt.o((TripPlannerDetailsState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.a((IconType) this.d, (String) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.u((TripPlannerResultsState) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 21:
                ((Integer) obj2).intValue();
                TripPlannerResultsScreenKt.r((TripPlannerResultDialogType) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 22:
                ((Integer) obj2).getClass();
                TripSummaryMainScreenKt.g((Modifier) this.b, (TicketSummaryReceiptCardUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 23:
                ((Integer) obj2).getClass();
                TripSummaryMainScreenKt.c((Modifier) this.b, (TicketInfoUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                TripSummaryMainScreenKt.a((Modifier) this.b, (RouteDetailInfoUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).intValue();
                TripSummaryMainScreenKt.l((TicketSummaryReceiptTotalFareUIState) this.d, (TicketSummaryReceiptCardUISpec) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 26:
                ((Integer) obj2).getClass();
                TripSummaryMainScreenKt.b((Modifier) this.b, (TextUIState.ChaloTextUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 27:
                ((Integer) obj2).getClass();
                TripSummaryMainScreenKt.i((ImageUrlUIState) this.d, (Modifier) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                UniversalPickerComposableKt.b((UniversalSearchRecentSearchItem) this.d, (Function1) this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                UpiAppScreenKt.a((Modifier) this.b, (NoUpiAppsErrorUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ cg1(Object obj, Object obj2, int i, int i2) {
        this.f11283a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }
}
