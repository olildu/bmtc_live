package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.core.Post_ride_feedback_table;
import app.chalo.home.ui.PremiumBusNotificationComponent;
import app.chalo.home.ui.PremiumBusNotificationViewState;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel;
import app.chalo.premiumbus.domain.ReschedulePremiumReserveTicketResult;
import app.chalo.premiumbus.prebookedtickets.domain.CancelPremiumReserveTicketResult;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationDialogType;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.prebookedtickets.productmodification.ProductModificationScreenType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchError;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionIntent;
import app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.SeatSelectionBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.NearByCardUIState;
import app.chalo.premiumbus.ui.slotselection.NearBySlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionIntent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.premiumbus.ui.stopselection.SelectedDateAndTime;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.userprofile.Gender;
import defpackage.pk0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class et0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15587a;
    public final /* synthetic */ Object b;

    public /* synthetic */ et0(Object obj, int i) {
        this.f15587a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SelectedDateAndTime selectedDateAndTime;
        int i = this.f15587a;
        Unit unit = Unit.f17538a;
        LinkedHashMap linkedHashMapU = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SqlCursor sqlCursor = (SqlCursor) obj;
                Object objI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                Object objJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                Object objJ2 = cb0.j(string2, sqlCursor, 4);
                String string3 = sqlCursor.getString(5);
                Object objJ3 = cb0.j(string3, sqlCursor, 6);
                Long l = sqlCursor.getLong(7);
                Object objE = cb0.e(l, sqlCursor, 8);
                String string4 = sqlCursor.getString(9);
                Object objJ4 = cb0.j(string4, sqlCursor, 10);
                String string5 = sqlCursor.getString(11);
                return ((ft0) obj2).invoke(objI, string, objJ, string2, objJ2, string3, objJ3, l, objE, string4, objJ4, string5, cb0.j(string5, sqlCursor, 12), sqlCursor.getLong(13));
            case 1:
                Post_ride_feedback_table post_ride_feedback_table = (Post_ride_feedback_table) obj2;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, post_ride_feedback_table.f1980a);
                execute.bindString(1, post_ride_feedback_table.b);
                execute.bindString(2, post_ride_feedback_table.c);
                execute.bindString(3, post_ride_feedback_table.d);
                execute.bindString(4, post_ride_feedback_table.e);
                execute.bindString(5, post_ride_feedback_table.f);
                execute.bindString(6, post_ride_feedback_table.g);
                execute.d(7, Long.valueOf(post_ride_feedback_table.h));
                execute.d(8, Long.valueOf(post_ride_feedback_table.i));
                execute.bindString(9, post_ride_feedback_table.j);
                execute.bindString(10, post_ride_feedback_table.k);
                execute.bindString(11, post_ride_feedback_table.l);
                execute.bindString(12, post_ride_feedback_table.m);
                execute.d(13, post_ride_feedback_table.n);
                return unit;
            case 2:
                ft0 ft0Var = (ft0) obj2;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                Object objI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string6 = sqlCursor2.getString(1);
                Object objJ5 = cb0.j(string6, sqlCursor2, 2);
                String string7 = sqlCursor2.getString(3);
                Object objJ6 = cb0.j(string7, sqlCursor2, 4);
                String string8 = sqlCursor2.getString(5);
                Object objJ7 = cb0.j(string8, sqlCursor2, 6);
                Long l2 = sqlCursor2.getLong(7);
                Object objE2 = cb0.e(l2, sqlCursor2, 8);
                String string9 = sqlCursor2.getString(9);
                Object objJ8 = cb0.j(string9, sqlCursor2, 10);
                String string10 = sqlCursor2.getString(11);
                return ft0Var.invoke(objI2, string6, objJ5, string7, objJ6, string8, objJ7, l2, objE2, string9, objJ8, string10, cb0.j(string10, sqlCursor2, 12), sqlCursor2.getLong(13));
            case 3:
                PremiumBusChangeStopArgs premiumBusChangeStopArgs = (PremiumBusChangeStopArgs) obj2;
                PremiumBusChangeStopDataState it = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusChangeStopDataState.a(it, premiumBusChangeStopArgs.b, premiumBusChangeStopArgs.c, premiumBusChangeStopArgs.d, premiumBusChangeStopArgs.e, premiumBusChangeStopArgs.f, null, null, null, null, null, null, null, null, null, null, 32736);
            case 4:
                VehicleLiveGpsLocationResponseAppModel vehicleLiveGpsLocationResponseAppModel = (VehicleLiveGpsLocationResponseAppModel) obj2;
                PremiumBusChangeStopDataState it2 = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusChangeStopDataState.a(it2, null, null, null, null, null, null, null, null, null, null, null, vehicleLiveGpsLocationResponseAppModel.b, Long.valueOf(vehicleLiveGpsLocationResponseAppModel.c), null, null, 26623);
            case 5:
                PremiumBusFareDetailsComponentDataState it3 = (PremiumBusFareDetailsComponentDataState) obj;
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = PremiumBusFareDetailsComponent.z;
                Intrinsics.i(it3, "it");
                return PremiumBusFareDetailsComponentDataState.a(it3, (PremiumBusFareDetailsFlowType) obj2, null, false, null, null, null, false, 122);
            case 6:
                PremiumBusFareDetailsComponentDataState it4 = (PremiumBusFareDetailsComponentDataState) obj;
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase2 = PremiumBusFareDetailsComponent.z;
                Intrinsics.i(it4, "it");
                return PremiumBusFareDetailsComponentDataState.a(it4, null, null, false, (PremiumBusFareDetailsSwitchError) obj2, null, null, false, 115);
            case 7:
                PremiumBusFareDetailsComponentDataState it5 = (PremiumBusFareDetailsComponentDataState) obj;
                PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase3 = PremiumBusFareDetailsComponent.z;
                Intrinsics.i(it5, "it");
                return PremiumBusFareDetailsComponentDataState.a(it5, ((PremiumBusFareDetailsComponent) obj2).p, null, false, null, null, null, false, WebSocketProtocol.PAYLOAD_SHORT);
            case 8:
                String strB = CityProviderKt.b(((PremiumBusNotificationComponent) obj2).k);
                ((PremiumBusNotificationViewState) obj).getClass();
                return new PremiumBusNotificationViewState(strB, true);
            case 9:
                PremiumBusProductModificationReasonsIntent.InitializationIntent initializationIntent = (PremiumBusProductModificationReasonsIntent.InitializationIntent) obj2;
                PremiumBusProductModificationReasonsViewState it6 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusProductModificationReasonsViewState.a(it6, null, null, initializationIntent.d, null, null, false, null, null, false, null, null, ProductModificationScreenType.REASON_SCREEN, null, Integer.valueOf(initializationIntent.e), null, 45051);
            case 10:
                PremiumBusProductModificationReasonsViewState it7 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it7, "it");
                return PremiumBusProductModificationReasonsViewState.a(it7, null, null, null, (PremiumBusBottomSheetTypeUIState.ViewAllSlots) obj2, null, false, null, null, false, null, null, null, null, null, null, 65007);
            case 11:
                PremiumBusProductModificationReasonsViewState it8 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it8, "it");
                return PremiumBusProductModificationReasonsViewState.a(it8, null, null, null, null, ((CancelPremiumReserveTicketResult.Success) obj2).f7297a, false, null, null, false, null, null, null, null, null, null, 65493);
            case 12:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, PremiumBusProductModificationDialogType.ORDER_CREATION_ERROR, null, null, null, false, ((ReschedulePremiumReserveTicketResult.ServerError) obj2).f7238a, null, false, null, null, null, null, null, null, 65405);
            case 13:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, PremiumBusProductModificationDialogType.LOADING, null, null, null, false, null, null, false, null, ((PremiumBusProductModificationReasonsComponent) obj2).E, null, null, null, null, 63485);
            case 14:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, null, null, null, null, false, null, null, false, ((PremiumBusProductModificationReasonsIntent.SlotClickedIntent) obj2).f7349a, null, null, null, null, null, 64511);
            case 15:
                PremiumBusProductSelectionDataState it9 = (PremiumBusProductSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return PremiumBusProductSelectionDataState.a(it9, false, false, null, false, null, null, false, null, ((PremiumBusProductSelectionIntent.ProductTypeSelectedIntent) obj2).f7697a, 255);
            case 16:
                PremiumBusProductSelectionDataState it10 = (PremiumBusProductSelectionDataState) obj;
                Intrinsics.i(it10, "it");
                return PremiumBusProductSelectionDataState.a(it10, false, false, null, false, null, null, ((PremiumBusProductSelectionIntent.FirstElementScrolledToTopIntent) obj2).f7694a, null, null, 447);
            case 17:
                ((PremiumBusProductSelectionComponent) obj2).K0(new PremiumBusProductSelectionIntent.FirstElementScrolledToTopIntent(((Boolean) obj).booleanValue()));
                return unit;
            case 18:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, new SeatSelectionBottomSheetType.GenderPreferenceBottomSheet(GenderConfirmationBottomSheetType.GenderPreferenceSelectionSuccess.f7716a), (Gender) obj2, null, 53247);
            case 19:
                PremiumBusSlotSelectionDataState it11 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it11, "it");
                return PremiumBusSlotSelectionDataState.a(it11, false, false, false, null, null, null, null, null, ((PremiumBusSlotSelectionIntent.SlotClickedIntent) obj2).f7886a, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -257);
            case 20:
                DateAndSlotSelectedForBulkBooking slotAvailableOnDateInfo = (DateAndSlotSelectedForBulkBooking) obj;
                Intrinsics.i(slotAvailableOnDateInfo, "slotAvailableOnDateInfo");
                return Boolean.valueOf(((HashSet) obj2).contains(slotAvailableOnDateInfo.b.a()));
            case 21:
                PremiumBusSlotSelectionDataState it12 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it12, "it");
                return PremiumBusSlotSelectionDataState.a(it12, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, ((PremiumBusSlotSelectionIntent.ConfirmSlotClickedIntent) obj2).b, null, null, null, null, -134217729);
            case 22:
                PremiumBusSlotSelectionDataState it13 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it13, "it");
                ((PremiumBusSlotSelectionIntent.ErrorScreenRetryBtnClickedIntent) obj2).getClass();
                return PremiumBusSlotSelectionDataState.a(it13, false, false, true, null, null, null, null, 0L, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -133);
            case 23:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, (PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) obj2, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            case 24:
                PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) obj;
                long j = ((PremiumBusSlotSelectionIntent.SectionItemClickedIntent) obj2).f7883a;
                Map map = premiumBusSlotSelectionDataState.g;
                if (map != null) {
                    linkedHashMapU = MapsKt.u(map);
                    Long l3 = premiumBusSlotSelectionDataState.h;
                    if (l3 != null) {
                        long jLongValue = l3.longValue();
                        PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(jLongValue));
                        if (pBODPairWithSlotSectionListUiModel != null) {
                            linkedHashMapU.put(Long.valueOf(jLongValue), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, null, null, false, 0, 0, true, false, 3071));
                        }
                    }
                }
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, true, null, null, null, linkedHashMapU, Long.valueOf(j), null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -197);
            case 25:
                final NearBySlotsCardUIState nearBySlotsCardUIState = (NearBySlotsCardUIState) obj2;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                final List list = nearBySlotsCardUIState.c;
                LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$NearByCardListUI$lambda$1$0$1$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$NearByCardListUI$lambda$1$0$1$0$0$$inlined$itemsIndexed$default$3
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
                                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            NearByCardUIState nearByCardUIState = (NearByCardUIState) list.get(iIntValue);
                            composer.startReplaceGroup(291069755);
                            if (nearByCardUIState instanceof NearByCardUIState.SlotUIState) {
                                composer.startReplaceGroup(291123911);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                final NearByCardUIState.SlotUIState slotUIState = (NearByCardUIState.SlotUIState) nearByCardUIState;
                                BorderUISpec borderUISpec = slotUIState.c;
                                Modifier modifierClip = ClipKt.clip(BorderUISpecKt.a(companion, borderUISpec), ChaloThemeKt.d(borderUISpec.c));
                                boolean zChanged = composer.changed(nearByCardUIState);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$NearByCardListUI$1$1$2$1$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            slotUIState.e.a();
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                ChaloTextViewKt.a(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloColorTokenKt.c(slotUIState.f7804a), null, 2, null), slotUIState.d), slotUIState.b, null, null, composer, 0, 12);
                                composer.endReplaceGroup();
                            } else {
                                if (!(nearByCardUIState instanceof NearByCardUIState.ViewMoreUIState)) {
                                    throw pk0.p(composer, 1256315177);
                                }
                                composer.startReplaceGroup(291892401);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                final NearByCardUIState.ViewMoreUIState viewMoreUIState = (NearByCardUIState.ViewMoreUIState) nearByCardUIState;
                                BorderUISpec borderUISpec2 = viewMoreUIState.b;
                                Modifier modifierClip2 = ClipKt.clip(BorderUISpecKt.a(companion2, borderUISpec2), ChaloThemeKt.d(borderUISpec2.c));
                                boolean zChanged2 = composer.changed(nearByCardUIState);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$NearByCardListUI$1$1$2$1$1$1$2$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            viewMoreUIState.d.a();
                                            return Unit.f17538a;
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                ChaloTextViewKt.a(ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierClip2, false, null, null, null, (Function0) objRememberedValue2, 15, null), viewMoreUIState.c), viewMoreUIState.f7805a, null, null, composer, 0, 12);
                                composer.endReplaceGroup();
                            }
                            if (iIntValue != nearBySlotsCardUIState.c.size() - 1) {
                                composer.startReplaceGroup(292546811);
                                ChaloSpacersKt.x(composer, 0);
                            } else {
                                composer.startReplaceGroup(264739532);
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
            case 26:
                PremiumBusStopSelectionIntent.OnTimeChangeIntent onTimeChangeIntent = (PremiumBusStopSelectionIntent.OnTimeChangeIntent) obj2;
                PremiumBusStopSelectionViewState it14 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it14, "it");
                if (it14.n != null) {
                    int i2 = onTimeChangeIntent.f7973a;
                    int i3 = onTimeChangeIntent.b;
                    String amOrPM = onTimeChangeIntent.c;
                    Intrinsics.i(amOrPM, "amOrPM");
                    selectedDateAndTime = new SelectedDateAndTime(i2, i3, amOrPM);
                } else {
                    selectedDateAndTime = null;
                }
                return PremiumBusStopSelectionViewState.a(it14, null, false, false, null, null, null, null, false, null, false, false, null, selectedDateAndTime, 81919);
            case 27:
                MapCameraViewState.UpdatedState.CustomCameraUpdate customCameraUpdate = (MapCameraViewState.UpdatedState.CustomCameraUpdate) obj2;
                PremiumReserveTicketPostBookingActionState it15 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it15, "it");
                PremiumBusLiveTrackingState premiumBusLiveTrackingState = it15.r;
                return PremiumReserveTicketPostBookingActionState.a(it15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, premiumBusLiveTrackingState != null ? PremiumBusLiveTrackingState.a(premiumBusLiveTrackingState, null, null, null, null, customCameraUpdate, 63) : null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 28:
                PremiumReserveTicketPostBookingActionState it16 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it16, "it");
                return PremiumReserveTicketPostBookingActionState.a(it16, null, null, null, null, null, null, null, null, null, null, null, null, (PremiumBusPostBookingBottomSheetType) obj2, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            default:
                PremiumReserveTicketPostBookingActionState it17 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it17, "it");
                return PremiumReserveTicketPostBookingActionState.a(it17, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (PremiumBusLiveTrackingState) obj2, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
        }
    }
}
