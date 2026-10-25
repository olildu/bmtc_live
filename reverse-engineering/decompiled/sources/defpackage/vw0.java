package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.EditCommand;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.core.Product_activation_details_table;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.home.data.model.app.response.AutoLinkDeviceIdResponseAppModel;
import app.chalo.home.ui.history.compose.components.RegularBusActiveTicketViewKt;
import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketUiState;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenViewIntent;
import app.chalo.home.ui.regularbus.RegularBusScreenBottomSheetType;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.home.ui.regularbus.SeatOccupancyBottomSheetData;
import app.chalo.juspay.JusPayErrorResultAppModel;
import app.chalo.juspay.JuspayOperationResult;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.productactivation.ui.ProductActivationDataState;
import app.chalo.productpurchase.productselection.ui.ProductAnnouncementTextUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionIntent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionProductsListSectionUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionProductsListUIState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType;
import app.chalo.reportproblem.ReportProblemDataState;
import app.chalo.reportproblem.ReportProblemIntent;
import app.chalo.reportproblem.ReportProblemViewState;
import app.chalo.scenes.args.ReportProblemArgs;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptDataState;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptIntent;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptViewState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.plotline.PlotlineWidgetUIState;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewIntent;
import app.chalo.vault.Quick_pay_receipt_table;
import com.inmobi.media.C2533k0;
import defpackage.pk0;
import io.github.alexzhirkevich.compottie.dynamic.PropertyProviderKt;
import io.github.alexzhirkevich.compottie.internal.AnimationState;
import io.github.alexzhirkevich.compottie.internal.shapes.RepeaterShape;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vw0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19873a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vw0(Object obj, int i) {
        this.f19873a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JusPayErrorResultAppModel jusPayErrorResultAppModel;
        int i = this.f19873a;
        int i2 = 2;
        int i3 = 6;
        int i4 = 0;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MapCameraViewState.UpdatedState.BoundToCustomLatLngs boundToCustomLatLngs = (MapCameraViewState.UpdatedState.BoundToCustomLatLngs) obj2;
                PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState = (PremiumReserveTicketPostBookingActionState) obj;
                PremiumBusLiveTrackingState premiumBusLiveTrackingState = premiumReserveTicketPostBookingActionState.r;
                return PremiumReserveTicketPostBookingActionState.a(premiumReserveTicketPostBookingActionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, null, null, null, null, boundToCustomLatLngs, 63) : null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 1:
                Long l = (Long) obj;
                l.longValue();
                ((PricingEngineRuleExpiryTickerDelegate) obj2).d.setValue(l);
                return unit;
            case 2:
                ProductActivationDataState it = (ProductActivationDataState) obj;
                Intrinsics.i(it, "it");
                return ProductActivationDataState.a(it, null, (ActivationProductData) obj2, null, null, false, null, null, null, null, false, null, null, false, 16381);
            case 3:
                ProductActivationDataState it2 = (ProductActivationDataState) obj;
                Intrinsics.i(it2, "it");
                return ProductActivationDataState.a(it2, null, null, null, null, false, null, null, null, null, false, null, (PremiumReserveTicketAppModel) obj2, false, 10239);
            case 4:
                return ProductSelectionDataState.a((ProductSelectionDataState) obj, ((ProductSelectionIntent.InitializationIntent) obj2).c, true, false, null, null, false, null, null, null, 1010);
            case 5:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                ArrayList arrayList = ((ProductSelectionProductsListUIState) obj2).f8690a;
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    final ProductSelectionProductsListSectionUIState productSelectionProductsListSectionUIState = (ProductSelectionProductsListSectionUIState) obj3;
                    LazyListScope lazyListScope = LazyColumn;
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-2081336969, true, new fu0(10, productSelectionProductsListSectionUIState, Modifier.INSTANCE)), 3, null);
                    PlotlineWidgetUIState plotlineWidgetUIState = productSelectionProductsListSectionUIState.b;
                    if (plotlineWidgetUIState != null) {
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1189135126, true, new qp0(plotlineWidgetUIState, i2)), 3, null);
                    }
                    ProductAnnouncementTextUIState productAnnouncementTextUIState = productSelectionProductsListSectionUIState.c;
                    if (productAnnouncementTextUIState != null) {
                        LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(48742487, true, new fu0(11, productAnnouncementTextUIState, productSelectionProductsListSectionUIState)), 3, null);
                    }
                    LazyListScope.CC.m(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1907089618, true, new la0(productSelectionProductsListSectionUIState, 29)), 3, null);
                    LazyColumn = lazyListScope;
                    final List list = productSelectionProductsListSectionUIState.d;
                    LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt$productSelectionSection$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            list.get(((Number) obj4).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt$productSelectionSection$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i5;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            Composer composer = (Composer) obj6;
                            int iIntValue2 = ((Number) obj7).intValue();
                            ProductSelectionProductsListSectionUISpec productSelectionProductsListSectionUISpec = productSelectionProductsListSectionUIState.e;
                            if ((iIntValue2 & 6) == 0) {
                                i5 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i5 = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i5 |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(802480018, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                ProductSelectionSectionItemUIState productSelectionSectionItemUIState = (ProductSelectionSectionItemUIState) list.get(iIntValue);
                                composer.startReplaceGroup(848176320);
                                if (productSelectionSectionItemUIState instanceof ProductSelectionSectionItemUIState.ProductItemUIState) {
                                    composer.startReplaceGroup(848247557);
                                    ProductSelectionScreenKt.a((ProductSelectionSectionItemUIState.ProductItemUIState) productSelectionSectionItemUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), productSelectionProductsListSectionUISpec.f8688a), composer, 0);
                                    composer.endReplaceGroup();
                                } else {
                                    if (!(productSelectionSectionItemUIState instanceof ProductSelectionSectionItemUIState.RecentProductItemUIState)) {
                                        throw pk0.p(composer, 720097187);
                                    }
                                    composer.startReplaceGroup(848566175);
                                    ProductSelectionScreenKt.l((ProductSelectionSectionItemUIState.RecentProductItemUIState) productSelectionSectionItemUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), productSelectionProductsListSectionUISpec.f8688a), composer, 0);
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
                }
                return unit;
            case 6:
                Product_activation_details_table product_activation_details_table = (Product_activation_details_table) obj2;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.d(0, Long.valueOf(product_activation_details_table.f1989a));
                execute.bindString(1, product_activation_details_table.b);
                execute.d(2, Long.valueOf(product_activation_details_table.c));
                execute.bindString(3, product_activation_details_table.d);
                execute.bindString(4, product_activation_details_table.e);
                execute.bindString(5, product_activation_details_table.f);
                execute.bindString(6, product_activation_details_table.g);
                return unit;
            case 7:
                SqlCursor sqlCursor = (SqlCursor) obj;
                Object objI = uf0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Object objJ = uf0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                Object objJ2 = cb0.j(string2, sqlCursor, 4);
                String string3 = sqlCursor.getString(5);
                return ((Function7) obj2).invoke(objI, string, objJ, string2, objJ2, string3, cb0.j(string3, sqlCursor, 6));
            case 8:
                ProfileScreenViewIntent it3 = (ProfileScreenViewIntent) obj;
                Intrinsics.i(it3, "it");
                ((ProfileScreenComponent) obj2).H0(it3);
                return unit;
            case 9:
                return PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9((FloatProducer) obj2, (SemanticsPropertyReceiver) obj);
            case 10:
                return QRScannerDataState.a((QRScannerDataState) obj, ((QRScannerViewIntent.InitializationIntent) obj2).f10725a.getC(), null, null, null, null, null, null, null, false, false, null, null, null, 16382);
            case 11:
                QRValidationLifecycleResult qRValidationLifecycleResult = (QRValidationLifecycleResult) obj2;
                QRValidationDataState currentState = (QRValidationDataState) obj;
                Intrinsics.i(currentState, "currentState");
                return QRValidationDataState.a(currentState, null, qRValidationLifecycleResult.b, null, null, qRValidationLifecycleResult.d, 0L, null, null, null, null, false, false, null, null, null, false, false, 131053);
            case 12:
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                Object objI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string4 = sqlCursor2.getString(1);
                Object objJ3 = uf0.j(string4, sqlCursor2, 2);
                Long l2 = sqlCursor2.getLong(3);
                Object objN = uf0.n(l2, sqlCursor2, 4);
                String string5 = sqlCursor2.getString(5);
                Object objJ4 = cb0.j(string5, sqlCursor2, 6);
                String string6 = sqlCursor2.getString(7);
                Object objJ5 = cb0.j(string6, sqlCursor2, 8);
                Object string7 = sqlCursor2.getString(9);
                Intrinsics.f(string7);
                Object string8 = sqlCursor2.getString(10);
                Object string9 = sqlCursor2.getString(11);
                Object string10 = sqlCursor2.getString(12);
                Intrinsics.f(string10);
                return ((Function21) obj2).invoke(objI2, string4, objJ3, l2, objN, string5, objJ4, string6, objJ5, string7, string8, string9, string10, sqlCursor2.getString(13), sqlCursor2.getString(14), sqlCursor2.getString(15), sqlCursor2.getString(16), sqlCursor2.getString(17), sqlCursor2.getString(18), sqlCursor2.getString(19), sqlCursor2.getString(20));
            case 13:
                Quick_pay_receipt_table quick_pay_receipt_table = (Quick_pay_receipt_table) obj2;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, quick_pay_receipt_table.f10748a);
                execute2.bindString(1, quick_pay_receipt_table.b);
                execute2.d(2, Long.valueOf(quick_pay_receipt_table.c));
                execute2.d(3, Long.valueOf(quick_pay_receipt_table.d));
                execute2.bindString(4, quick_pay_receipt_table.e);
                execute2.bindString(5, quick_pay_receipt_table.f);
                execute2.bindString(6, quick_pay_receipt_table.g);
                execute2.bindString(7, quick_pay_receipt_table.h);
                execute2.bindString(8, quick_pay_receipt_table.i);
                execute2.bindString(9, quick_pay_receipt_table.j);
                execute2.bindString(10, quick_pay_receipt_table.k);
                execute2.bindString(11, quick_pay_receipt_table.l);
                execute2.bindString(12, quick_pay_receipt_table.m);
                execute2.bindString(13, quick_pay_receipt_table.n);
                execute2.bindString(14, quick_pay_receipt_table.o);
                execute2.bindString(15, quick_pay_receipt_table.p);
                execute2.bindString(16, quick_pay_receipt_table.q);
                execute2.bindString(17, quick_pay_receipt_table.r);
                execute2.bindString(18, quick_pay_receipt_table.s);
                execute2.bindString(19, quick_pay_receipt_table.t);
                execute2.bindString(20, quick_pay_receipt_table.u);
                return unit;
            case 14:
                QuickpayTripAmountDataState it4 = (QuickpayTripAmountDataState) obj;
                Intrinsics.i(it4, "it");
                return QuickpayTripAmountDataState.a(it4, null, null, null, 0L, false, false, (QuickpayTripAmountScreenBottomSheetType) obj2, 0L, false, null, 959);
            case 15:
                return ReceiveContentNode._init_$lambda$0((ReceiveContentNode) obj2, (DragAndDropEvent) obj);
            case 16:
                return Recomposer.readObserverOf$lambda$0((ControlledComposition) obj2, obj);
            case 17:
                return Recomposer.effectJob$lambda$0$0((Recomposer) obj2, (Throwable) obj);
            case 18:
                return RecordingInputConnection.performHandwritingGesture$lambda$0((RecordingInputConnection) obj2, (EditCommand) obj);
            case 19:
                RegularBusViewState it5 = (RegularBusViewState) obj;
                Intrinsics.i(it5, "it");
                return RegularBusViewState.a(it5, false, null, null, null, false, null, null, null, null, null, RegularBusScreenBottomSheetType.SeatOccupancyInfoBottomSheet.f3634a, (SeatOccupancyBottomSheetData) obj2, null, null, null, null, null, false, false, false, false, 4188159);
            case 20:
                Map scanAndPayProperties = (Map) obj;
                Intrinsics.i(scanAndPayProperties, "$this$scanAndPayProperties");
                scanAndPayProperties.put("navigatedToSettings", Boolean.valueOf(((RegularBusViewIntent.JuspayPermissionRationaleDialogInteraction) obj2).f3640a));
                return unit;
            case 21:
                JuspayOperationResult juspayOperationResult = (JuspayOperationResult) obj2;
                Map raiseScanAndPayEnded = (Map) obj;
                Intrinsics.i(raiseScanAndPayEnded, "$this$raiseScanAndPayEnded");
                JuspayOperationResult.Error error = juspayOperationResult instanceof JuspayOperationResult.Error ? (JuspayOperationResult.Error) juspayOperationResult : null;
                if (error != null && (jusPayErrorResultAppModel = error.f4056a) != null) {
                    raiseScanAndPayEnded.put("errorCode", jusPayErrorResultAppModel.f.f4044a);
                    raiseScanAndPayEnded.put("errorMessage", jusPayErrorResultAppModel.e);
                    raiseScanAndPayEnded.put(C2533k0.KEY_REQUEST_ID, jusPayErrorResultAppModel.b);
                }
                return unit;
            case 22:
                return RememberSaveableKt.mutableStateSaver$lambda$0$1((Saver) obj2, (MutableState) obj);
            case 23:
                Intrinsics.i((AnimationState) obj, "it");
                boolean z = ((RepeaterShape) obj2).f;
                int i5 = PropertyProviderKt.f16122a;
                return Boolean.valueOf(z);
            case 24:
                ReportProblemArgs reportProblemArgs = (ReportProblemArgs) obj2;
                ReportProblemDataState it6 = (ReportProblemDataState) obj;
                Intrinsics.i(it6, "it");
                return ReportProblemDataState.a(it6, false, reportProblemArgs.b, reportProblemArgs.d, reportProblemArgs.e, reportProblemArgs.f, false, false, false, false, 481);
            case 25:
                ReportProblemDataState it7 = (ReportProblemDataState) obj;
                Intrinsics.i(it7, "it");
                return ReportProblemDataState.a(it7, false, null, null, null, null, false, false, false, ((ReportProblemIntent.InternetConnectionIntent) obj2).f9021a != NetworkConnectionType.CONNECTED, 255);
            case 26:
                return ReportProblemDataState.a((ReportProblemDataState) obj, false, null, null, null, null, false, true, ((AutoLinkDeviceIdResponseAppModel) ((ChaloUseCaseResult.Success) ((ChaloUseCaseResult) obj2)).f10419a).f2949a, false, TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            case 27:
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                final List list2 = ((ReportProblemViewState) obj2).c;
                LazyColumn2.items(list2.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.reportproblem.ReportProblemScreenKt$ReportProblemScreenContent$lambda$1$1$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list2.get(((Number) obj4).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.reportproblem.ReportProblemScreenKt$ReportProblemScreenContent$lambda$1$1$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i6 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i6 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i6 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i6, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            ProblemListUIState problemListUIState = (ProblemListUIState) list2.get(iIntValue);
                            composer.startReplaceGroup(-693629942);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ProblemListUISpecs problemListUISpecs = problemListUIState.f9015a;
                            ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(problemListUISpecs.c), null, 2, null), problemListUISpecs.f9014a), problemListUIState.b, null, null, composer, 0, 12);
                            composer.startReplaceGroup(531825639);
                            ArrayList arrayList2 = problemListUIState.c;
                            int size2 = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                int i8 = i7 + 1;
                                final ProblemUIState problemUIState = (ProblemUIState) arrayList2.get(i7);
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                boolean zChangedInstance = composer.changedInstance(problemUIState);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: app.chalo.reportproblem.ReportProblemScreenKt$ReportProblemScreenContent$2$2$1$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            problemUIState.b.a();
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                ChaloTextViewKt.a(ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default2, false, null, null, null, (Function0) objRememberedValue, 15, null), problemListUISpecs.b), problemUIState.f9016a, null, null, composer, 0, 12);
                                DividerUIStateKt.a(null, problemListUIState.d, composer, 0, 1);
                                i7 = i8;
                            }
                            composer.endReplaceGroup();
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
                return unit;
            case 28:
                RideReceiptDataState it8 = (RideReceiptDataState) obj;
                Intrinsics.i(it8, "it");
                return RideReceiptDataState.a(it8, true, ((RideReceiptIntent.InitializationIntent) obj2).f9741a, null, 4);
            default:
                RideReceiptViewState rideReceiptViewState = (RideReceiptViewState) obj2;
                LazyListScope LazyColumn3 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn3, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn3, null, null, ComposableLambdaKt.composableLambdaInstance(-830559587, true, new sx0(rideReceiptViewState, i3)), 3, null);
                final List list3 = rideReceiptViewState.f;
                LazyColumn3.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreenKt$RideReceiptMainScreen$lambda$2$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        list3.get(((Number) obj4).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreenKt$RideReceiptMainScreen$lambda$2$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i6 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i6 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i6 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            RegularBusTicketUiState regularBusTicketUiState = (RegularBusTicketUiState) list3.get(iIntValue);
                            composer.startReplaceGroup(-1908745756);
                            RegularBusActiveTicketViewKt.a(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer, 0).t, null, 2, null), regularBusTicketUiState, composer, 0);
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
                return unit;
        }
    }
}
