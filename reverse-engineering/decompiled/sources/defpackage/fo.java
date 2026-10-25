package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.checkout.ui.screen.netbanking.NetBankingAppsDataState;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.upi.UpiAppsDataState;
import app.chalo.checkout.ui.screen.wallet.WalletAppsDataState;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.base.RideHailingUserFeedbackData;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModelKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.validationsdk.blevalidation.ui.common.ComposableSingletons$JourneyDetailsBottomSheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fo implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15660a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ fo(int i, String str, List list) {
        this.f15660a = i;
        this.b = str;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15660a) {
            case 0:
                return NetBankingAppsDataState.a((NetBankingAppsDataState) obj, this.b, null, this.c, 4);
            case 1:
                ((UpiAppsDataState) obj).getClass();
                return new UpiAppsDataState(this.b, this.c);
            case 2:
                List listD0 = CollectionsKt.D0(this.c);
                ((WalletAppsDataState) obj).getClass();
                return new WalletAppsDataState(this.b, listD0);
            case 3:
                return HomeScreenFragmentViewState.a((HomeScreenFragmentViewState) obj, null, null, null, null, null, null, null, null, new RideHailingUserFeedbackData(this.b, null, this.c), null, null, null, false, 31743);
            case 4:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                final List list = this.c;
                LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1286424680, true, new rb(4, list, this.b)), 3, null);
                LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$JourneyDetailsBottomSheetKt.f10624a, 3, null);
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt$JourneyDetailsBottomSheetContent$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt$JourneyDetailsBottomSheetContent$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            Object obj6 = list.get(iIntValue);
                            int i2 = i & WebSocketProtocol.PAYLOAD_SHORT;
                            TripPlannerLegUiModel tripPlannerLegUiModel = (TripPlannerLegUiModel) obj6;
                            composer.startReplaceGroup(158951122);
                            boolean z = iIntValue == CollectionsKt.K(list);
                            IconType iconType = IconType.AC_BG;
                            IconType iconTypeA = iIntValue > 0 ? IconType.IC_SWAP_HORIZONTAL_CIRCLE : TripPlannerItineraryUiModelKt.a(tripPlannerLegUiModel);
                            if (tripPlannerLegUiModel instanceof TripPlannerLegUiModel.Metro) {
                                composer.startReplaceGroup(159326531);
                                String strC = null;
                                if (iIntValue > 0) {
                                    composer.startReplaceGroup(159403008);
                                    String str = ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel).s;
                                    if (str == null) {
                                        composer.startReplaceGroup(159403007);
                                    } else {
                                        composer.startReplaceGroup(159403008);
                                        strC = StringResourcesHelperKt.c(StringEnum.CHANGE_AT, new Object[]{str}, composer, 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endReplaceGroup();
                                } else {
                                    composer.startReplaceGroup(159585505);
                                    String str2 = ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel).s;
                                    if (str2 == null) {
                                        composer.startReplaceGroup(159585504);
                                    } else {
                                        composer.startReplaceGroup(159585505);
                                        strC = StringResourcesHelperKt.c(StringEnum.BOARD_AT, new Object[]{str2}, composer, 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endReplaceGroup();
                                }
                                TripPlannerLegUiModel.Metro metro = (TripPlannerLegUiModel.Metro) tripPlannerLegUiModel;
                                JourneyDetailsBottomSheetKt.g(iconTypeA, metro, metro.f4757a, iIntValue, z, strC, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).f, 0.0f, 0.0f, 0.0f, 14, null), composer, (i2 << 6) & 7168);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(160193260);
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return Unit.f17538a;
            default:
                PaymentDataState it = (PaymentDataState) obj;
                Intrinsics.i(it, "it");
                return PaymentDataState.a(it, this.b, false, null, false, null, null, false, null, null, null, this.c, false, false, false, null, false, null, 2095088);
        }
    }

    public /* synthetic */ fo(List list, String str) {
        this.f15660a = 4;
        this.c = list;
        this.b = str;
    }
}
