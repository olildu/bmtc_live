package defpackage;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.contextmenu.ContextMenuGesturesKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.datastore.core.CorruptionException;
import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.electricitybill.ui.ebillamount.EBillAmountIntent;
import app.chalo.electricitybill.ui.ebillamount.EbillAmountComponent;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchComponent;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchIntent;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationIntent;
import app.chalo.electricitybill.ui.invoice.EBillPaymentInvoiceDataState;
import app.chalo.electricitybill.ui.paymenthistory.EBillHistoryItemUIState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryScreenUIState;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsBottomSheetType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingInfoBottomSheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenDataState;
import app.chalo.metro.ui.confirmbooking.ConfirmationBookingScreenData;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseIntent;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.productsummary.ui.data.DashedLineUIState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.vault.Config;
import com.arkivanov.decompose.backhandler.DefaultChildBackHandler;
import com.arkivanov.essenty.backhandler.DefaultBackDispatcher;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SessionDataSerializer;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.DefaultRequestKt;
import io.ktor.client.plugins.sse.DefaultClientSSESession;
import io.ktor.http.CodecsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.JobImpl;
import okhttp3.internal.cache.DiskLruCache;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19141a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp(Object obj, int i) {
        this.f19141a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19141a;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TextFieldValue it = (TextFieldValue) obj;
                Intrinsics.i(it, "it");
                ((BaseTextFieldUIState.ClickableTextFieldUIState) obj2).getB().b(it.getText());
                return unit;
            case 1:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (bByteValue == 32) {
                    Set set = CodecsKt.f16763a;
                    sb.append("%20");
                } else if (CodecsKt.f16763a.contains(b) || CodecsKt.d.contains(b)) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(CodecsKt.g(bByteValue));
                }
                return unit;
            case 2:
                Config config = (Config) obj2;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, config.f10745a);
                execute.bindString(1, config.b);
                return unit;
            case 3:
                ConfirmationBookingScreenData confirmationBookingScreenData = (ConfirmationBookingScreenData) obj2;
                ConfirmBookingScreenDataState it2 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return ConfirmBookingScreenDataState.a(it2, confirmationBookingScreenData.b, false, confirmationBookingScreenData.c, confirmationBookingScreenData.d, confirmationBookingScreenData.e, confirmationBookingScreenData.f, null, null, confirmationBookingScreenData.g, false, false, false, 7557);
            case 4:
                ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = (ConfirmSuperPassPurchaseViewModel) obj2;
                Long l = (Long) obj;
                if (l != null) {
                    confirmSuperPassPurchaseViewModel.K(new ConfirmSuperPassPurchaseIntent.DateSelectedIntent(l.longValue()));
                } else {
                    confirmSuperPassPurchaseViewModel.K(ConfirmSuperPassPurchaseIntent.DismissDialogIntent.f8367a);
                }
                return unit;
            case 5:
                return ContextMenuGesturesKt.contextMenuGestures$lambda$0((ContextMenuState) obj2, (Offset) obj);
            case 6:
                return DatePickerKt.WeekDays$lambda$48$lambda$47$lambda$45$lambda$44((Pair) obj2, (SemanticsPropertyReceiver) obj);
            case 7:
                ((Boolean) obj).booleanValue();
                ((DefaultBackDispatcher) obj2).h();
                return unit;
            case 8:
                ((Boolean) obj).booleanValue();
                KProperty[] kPropertyArr = DefaultChildBackHandler.e;
                ((DefaultChildBackHandler) obj2).i();
                return unit;
            case 9:
                ((DefaultClientSSESession) obj2).d();
                return unit;
            case 10:
                DefaultRequest.DefaultRequestBuilder install = (DefaultRequest.DefaultRequestBuilder) obj;
                Logger logger = DefaultRequestKt.f16642a;
                Intrinsics.i(install, "$this$install");
                ((b90) obj2).invoke(install);
                return unit;
            case 11:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$4$lambda$3((SingleRowTopAppBarOverrideScope) obj2, ((Float) obj).floatValue());
            case 12:
                ((JobImpl) obj2).complete();
                return unit;
            case 13:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$15$lambda$14((TwoRowsTopAppBarOverrideScope) obj2, ((Float) obj).floatValue());
            case 14:
                return DiskLruCache.newJournalWriter$lambda$3((DiskLruCache) obj2, (IOException) obj);
            case 15:
                ((coil3.disk.DiskLruCache) obj2).l = true;
                return unit;
            case 16:
                return Boolean.valueOf(DragGestureNode._canDrag$lambda$0((DragGestureNode) obj2, (PointerType) obj));
            case 17:
                Density offset = (Density) obj;
                TweenSpec tweenSpec = DrawerKt.f4449a;
                Intrinsics.i(offset, "$this$offset");
                return IntOffset.m7393boximpl(IntOffset.m7396constructorimpl((((long) 0) << 32) | (((long) MathKt.f(((Number) ((BottomDrawerState) obj2).e.getValue()).floatValue())) & BodyPartID.bodyIdMax)));
            case 18:
                String it3 = (String) obj;
                Intrinsics.i(it3, "it");
                ((EBillFetchComponent) obj2).H0(new EBillFetchIntent.NumberEnteredIntent(it3));
                return unit;
            case 19:
                EBillFetchDataState it4 = (EBillFetchDataState) obj;
                Intrinsics.i(it4, "it");
                return EBillFetchDataState.a(it4, false, null, false, null, false, false, ((EBillFetchIntent.InternetConnectionIntent) obj2).f2561a != NetworkConnectionType.CONNECTED, null, 159);
            case 20:
                EBillPaymentConfirmationDataState it5 = (EBillPaymentConfirmationDataState) obj;
                Intrinsics.i(it5, "it");
                return EBillPaymentConfirmationDataState.a(it5, false, false, null, null, ((EBillPaymentConfirmationIntent.InternetConnectionIntent) obj2).f2571a != NetworkConnectionType.CONNECTED, 15);
            case 21:
                final ElectricityPaymentHistoryScreenUIState.HistoryAvailable historyAvailable = (ElectricityPaymentHistoryScreenUIState.HistoryAvailable) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                final List list = historyAvailable.b;
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenKt$PaymentHistoryAvailableUI$lambda$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.electricitybill.ui.paymenthistory.ui.EBillPaymentHistoryScreenKt$PaymentHistoryAvailableUI$lambda$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            EBillHistoryItemUIState eBillHistoryItemUIState = (EBillHistoryItemUIState) list.get(iIntValue);
                            composer.startReplaceGroup(154964890);
                            EBillPaymentHistoryScreenKt.a(eBillHistoryItemUIState, composer, 0);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, historyAvailable.f2602a.b), composer, 0);
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
            case 22:
                Intrinsics.i((EBillPaymentInvoiceDataState) obj, "it");
                return new EBillPaymentInvoiceDataState((ElectricityBillPaymentHistoryUiModel) obj2);
            case 23:
                String it6 = (String) obj;
                Intrinsics.i(it6, "it");
                ((EbillAmountComponent) obj2).G0(new EBillAmountIntent.AmountEnteredIntent(it6));
                return unit;
            case 24:
                Query query = (Query) obj2;
                SqlCursor cursor = (SqlCursor) obj;
                Intrinsics.i(cursor, "cursor");
                ArrayList arrayList = new ArrayList();
                while (((Boolean) cursor.next().b).booleanValue()) {
                    arrayList.add(query.f699a.invoke(cursor));
                }
                return new QueryResult.Value(arrayList);
            case 25:
                ExecutableQuery executableQuery = (ExecutableQuery) obj2;
                SqlCursor cursor2 = (SqlCursor) obj;
                Intrinsics.i(cursor2, "cursor");
                if (!((Boolean) cursor2.next().b).booleanValue()) {
                    return new QueryResult.Value(null);
                }
                Object objInvoke = executableQuery.f699a.invoke(cursor2);
                if (!((Boolean) cursor2.next().b).booleanValue()) {
                    return new QueryResult.Value(objInvoke);
                }
                throw new IllegalStateException(("ResultSet returned more than 1 row for " + executableQuery).toString());
            case 26:
                FareDetailsViewState it7 = (FareDetailsViewState) obj;
                Intrinsics.i(it7, "it");
                return FareDetailsViewState.a(it7, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, new FareDetailsBottomSheetType.TncSection(((FareDetailsViewState) ((FareDetailsComponent) obj2).f.getValue()).p), null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 27:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, FareDetailsBottomSheetType.UserBillingDetails.f3924a, null, null, false, false, (UserBillingInfoBottomSheetState) obj2, null, null, false, null, false, null, null, null, null, null, null, -33816577, 31);
            case 28:
                DrawScope Canvas = (DrawScope) obj;
                Intrinsics.i(Canvas, "$this$Canvas");
                float f = 2;
                DrawScope.CC.E(Canvas, ChaloColorTokenKt.c(((DashedLineUIState) obj2).f8749a), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) / f)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5073getSizeNHjbRc() & BodyPartID.bodyIdMax)) / f)) & BodyPartID.bodyIdMax)), 1.0f, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f), 0.0f, null, 0, 464, null);
                return unit;
            default:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3((SessionDataSerializer) obj2, (CorruptionException) obj);
        }
    }
}
