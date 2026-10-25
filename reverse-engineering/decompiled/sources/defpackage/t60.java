package defpackage;

import android.view.View;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.core.Instant_ticket_receipt_table;
import app.chalo.core.Instant_ticket_receipt_tableQueries;
import app.chalo.core.Instant_ticket_tableQueries;
import app.chalo.core.Last_ride_info_table;
import app.chalo.core.Last_ride_info_tableQueries;
import app.chalo.core.Magic_super_pass_table;
import app.chalo.core.Magic_super_pass_tableQueries;
import app.chalo.core.Metro_ticket_table;
import app.chalo.core.Metro_ticket_tableQueries;
import app.chalo.core.database.dao.InstantTicketDaoImpl;
import app.chalo.core.database.mappers.InstantTicketEntityMapperKt;
import app.chalo.core.database.mappers.MetroTicketEntityMapperKt;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.features.language.data.Language;
import app.chalo.home.BottomSheetState;
import app.chalo.home.CommonBottomSheetData;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.base.CommonBottomSheetType;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.home.ui.history.factory.CtaClickedType;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.home.LocationTooltipData;
import app.chalo.home.ui.home.LocationTurnOnTooltipType;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpIntent;
import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyModel;
import app.chalo.location.LocationUpdateResult;
import app.chalo.metro.dao.MetroTicketEntity;
import app.chalo.metro.dao.MetroTicketStopDetailsEntity;
import app.chalo.metro.ui.landing.MetroLandingScreenBottomSheetType;
import app.chalo.metro.ui.landing.MetroLandingScreenComponent;
import app.chalo.metro.ui.landing.MetroLandingScreenDataState;
import app.chalo.metro.ui.landing.MetroLineListItemState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoIntent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoRestoredState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.onboarding.languageselection.LanguageDetails;
import app.chalo.onboarding.languageselection.LanguageSelectionDataState;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import app.chalo.recent.model.app.RecentStopAndRouteBasedAppModel;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.security.sync.keystorage.KeyEntity;
import app.chalo.superpass.data.models.entities.PremiumBusMeta;
import app.chalo.vault.Keystorage;
import app.chalo.vault.KeystorageQueries;
import app.chalo.vault.dao.KeyDaoImpl;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.ClientEventsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t60 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19632a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t60(int i, Object obj, Object obj2) {
        this.f19632a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Source source;
        switch (this.f19632a) {
            case 0:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, false, null, ((GroupTicketJourneyModel) this.b).f4653a, (LinkedHashMap) this.c, null, 0, null, 229);
            case 1:
                ((HandlerContext) this.b).f17747a.removeCallbacks((r00) this.c);
                return Unit.f17538a;
            case 2:
                Function2 function2 = (Function2) this.b;
                ChaloUserBookingType.TicketBooking.PassRideBooking passRideBooking = (ChaloUserBookingType.TicketBooking.PassRideBooking) this.c;
                CtaClickedType it = (CtaClickedType) obj;
                Intrinsics.i(it, "it");
                function2.invoke(passRideBooking, it);
                return Unit.f17538a;
            case 3:
                CommonBottomSheetData commonBottomSheetData = (CommonBottomSheetData) this.b;
                CommonBottomSheetType commonBottomSheetType = (CommonBottomSheetType) this.c;
                HomeScreenFragmentViewState it2 = (HomeScreenFragmentViewState) obj;
                Intrinsics.i(it2, "it");
                return HomeScreenFragmentViewState.a(it2, null, null, null, null, new BottomSheetState(commonBottomSheetData, commonBottomSheetType, true), null, null, null, null, null, null, null, false, 32735);
            case 4:
                HomeScreenComponent homeScreenComponent = (HomeScreenComponent) this.b;
                LocationUpdateResult.SettingsResolutionRequired settingsResolutionRequired = (LocationUpdateResult.SettingsResolutionRequired) this.c;
                HomeScreenViewState it3 = (HomeScreenViewState) obj;
                Intrinsics.i(it3, "it");
                return HomeScreenViewState.a(it3, null, null, null, null, null, null, null, null, false, null, new LocationTooltipData(homeScreenComponent.A.getR(), LocationTurnOnTooltipType.RequestGpsTurnOn.f3585a), settingsResolutionRequired.f5157a, null, null, null, false, false, false, 518143);
            case 5:
                final SnapshotStateMap snapshotStateMap = (SnapshotStateMap) this.b;
                final String str = (String) this.c;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: app.chalo.home.ui.home.HomeTabScaffoldKt$HomeScreenContent$lambda$4$0$14$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        snapshotStateMap.remove(str);
                    }
                };
            case 6:
                HttpClient httpClient = (HttpClient) this.b;
                HttpResponse httpResponse = (HttpResponse) this.c;
                if (((Throwable) obj) != null) {
                    httpClient.j.a(ClientEventsKt.e, httpResponse);
                }
                return Unit.f17538a;
            case 7:
                return IndicatorLineNode.drawWithCacheModifierNode$lambda$3$lambda$2((Path) this.b, (IndicatorLineNode) this.c, (ContentDrawScope) obj);
            case 8:
                return InfiniteTransitionKt.animateValue$lambda$2$0((InfiniteTransition) this.b, (InfiniteTransition.TransitionAnimationState) this.c, (DisposableEffectScope) obj);
            case 9:
                InstantTicketDaoImpl instantTicketDaoImpl = (InstantTicketDaoImpl) this.b;
                List list = (List) this.c;
                Instant_ticket_tableQueries instant_ticket_tableQueries = instantTicketDaoImpl.f2051a;
                instant_ticket_tableQueries.f697a.A0(-1556537348, "DELETE FROM instant_ticket_table\nWHERE bookingId NOT IN (SELECT subTicketId FROM multi_modal_group_ticket_child_table WHERE productSubType = \"instantTicket\")", null);
                instant_ticket_tableQueries.T(-1556537348, new ib0(2));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    instantTicketDaoImpl.f2051a.d0(InstantTicketEntityMapperKt.a((InstantTicketEntity) it4.next()));
                }
                return Unit.f17538a;
            case 10:
                Instant_ticket_receipt_table instant_ticket_receipt_table = (Instant_ticket_receipt_table) this.b;
                Instant_ticket_receipt_tableQueries instant_ticket_receipt_tableQueries = (Instant_ticket_receipt_tableQueries) this.c;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, instant_ticket_receipt_table.f1958a);
                execute.d(1, Long.valueOf(instant_ticket_receipt_table.b));
                execute.d(2, Long.valueOf(instant_ticket_receipt_table.c));
                execute.bindString(3, instant_ticket_receipt_table.d);
                execute.bindString(4, instant_ticket_receipt_table.e);
                execute.bindString(5, instant_ticket_receipt_table.f);
                execute.bindString(6, instant_ticket_receipt_table.g);
                execute.bindString(7, instant_ticket_receipt_table.h);
                execute.bindString(8, instant_ticket_receipt_table.i);
                Map map = instant_ticket_receipt_table.j;
                execute.bindString(9, map != null ? (String) instant_ticket_receipt_tableQueries.b.f1959a.encode(map) : null);
                execute.bindString(10, instant_ticket_receipt_table.k);
                execute.bindString(11, (String) instant_ticket_receipt_tableQueries.b.b.encode(instant_ticket_receipt_table.l));
                execute.bindString(12, instant_ticket_receipt_table.m);
                execute.bindString(13, instant_ticket_receipt_table.n);
                execute.bindString(14, instant_ticket_receipt_table.o);
                execute.bindString(15, instant_ticket_receipt_table.p);
                execute.bindString(16, instant_ticket_receipt_table.q);
                execute.bindString(17, instant_ticket_receipt_table.r);
                execute.bindString(18, instant_ticket_receipt_table.s);
                ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = instant_ticket_receipt_table.t;
                execute.bindString(19, receiptFareDataApiResponseModel != null ? (String) instant_ticket_receipt_tableQueries.b.c.encode(receiptFareDataApiResponseModel) : null);
                return Unit.f17538a;
            case 11:
                Function20 function20 = (Function20) this.b;
                Instant_ticket_receipt_table.Adapter adapter = ((Instant_ticket_receipt_tableQueries) this.c).b;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                Long lE = cb0.e(l, sqlCursor, 2);
                String string = sqlCursor.getString(3);
                String strJ = cb0.j(string, sqlCursor, 4);
                String string2 = sqlCursor.getString(5);
                String strJ2 = cb0.j(string2, sqlCursor, 6);
                String string3 = sqlCursor.getString(7);
                String strJ3 = cb0.j(string3, sqlCursor, 8);
                String string4 = sqlCursor.getString(9);
                Map map2 = string4 != null ? (Map) adapter.f1959a.a(string4) : null;
                String string5 = sqlCursor.getString(10);
                Object objG = cb0.g(sqlCursor, 11, adapter.b);
                String string6 = sqlCursor.getString(12);
                String string7 = sqlCursor.getString(13);
                String string8 = sqlCursor.getString(14);
                String string9 = sqlCursor.getString(15);
                String string10 = sqlCursor.getString(16);
                String string11 = sqlCursor.getString(17);
                String string12 = sqlCursor.getString(18);
                String string13 = sqlCursor.getString(19);
                return function20.invoke(strI, l, lE, string, strJ, string2, strJ2, string3, strJ3, map2, string5, objG, string6, string7, string8, string9, string10, string11, string12, string13 != null ? (ReceiptFareDataApiResponseModel) adapter.c.a(string13) : null);
            case 12:
                MutableFloatState mutableFloatState = (MutableFloatState) this.b;
                MutableFloatState mutableFloatState2 = (MutableFloatState) this.c;
                LayoutCoordinates it5 = (LayoutCoordinates) obj;
                Intrinsics.i(it5, "it");
                float fMo5941getSizeYbymL2g = (int) (it5.mo5941getSizeYbymL2g() >> 32);
                if (mutableFloatState.getFloatValue() > 0.0f && mutableFloatState.getFloatValue() < fMo5941getSizeYbymL2g) {
                    float floatValue = (fMo5941getSizeYbymL2g - mutableFloatState.getFloatValue()) / fMo5941getSizeYbymL2g;
                    if (floatValue > mutableFloatState2.getFloatValue()) {
                        mutableFloatState2.setFloatValue(floatValue);
                    }
                }
                return Unit.f17538a;
            case 13:
                List<KeyEntity> list2 = (List) this.b;
                KeyDaoImpl keyDaoImpl = (KeyDaoImpl) this.c;
                for (KeyEntity keyEntity : list2) {
                    KeystorageQueries keystorageQueriesF = keyDaoImpl.f10754a.f();
                    Intrinsics.i(keyEntity, "<this>");
                    keystorageQueriesF.X(new Keystorage(keyEntity.f9392a, keyEntity.b, keyEntity.c, keyEntity.d));
                }
                return Unit.f17538a;
            case 14:
                return LanguageSelectionDataState.a((LanguageSelectionDataState) obj, false, null, false, false, null, null, new LanguageDetails((String) this.b, ((Language) this.c).getLocale()), null, 190);
            case 15:
                Last_ride_info_table last_ride_info_table = (Last_ride_info_table) this.b;
                Last_ride_info_tableQueries last_ride_info_tableQueries = (Last_ride_info_tableQueries) this.c;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, last_ride_info_table.f1962a);
                execute2.bindString(1, (String) last_ride_info_tableQueries.b.f1963a.encode(last_ride_info_table.b));
                return Unit.f17538a;
            case 16:
                View view = (View) this.b;
                MutableState mutableState = (MutableState) this.c;
                LayoutCoordinates coords = (LayoutCoordinates) obj;
                Intrinsics.i(coords, "coords");
                Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(coords);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                mutableState.setValue(new Rect(rectBoundsInRoot.getLeft() + f, rectBoundsInRoot.getTop() + f2, rectBoundsInRoot.getRight() + f, rectBoundsInRoot.getBottom() + f2));
                return Unit.f17538a;
            case 17:
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$7((LazyGridMeasuredLineProvider) this.b, (LazyGridMeasuredItemProvider) this.c, ((Integer) obj).intValue());
            case 18:
                return LazySaveableStateHolder.Companion.saver$lambda$1((SaveableStateRegistry) this.b, (SaveableStateHolder) this.c, (Map) obj);
            case 19:
                ChaloNavigationManagerKt.e(((MTicketPassengerSelectionComponent) this.b).w, new MinProfileUpdateArgs((String) this.c, ((Boolean) obj).booleanValue(), Source.MTICKET_SELECTION_ACTIVITY), null, 6);
                return Unit.f17538a;
            case 20:
                MTicketTripInfoComponent mTicketTripInfoComponent = (MTicketTripInfoComponent) this.b;
                MTicketTripInfoIntent.InitialisationIntent initialisationIntent = (MTicketTripInfoIntent.InitialisationIntent) this.c;
                MTicketTripInfoDataState mTicketTripInfoDataState = (MTicketTripInfoDataState) obj;
                MTicketTripInfoRestoredState mTicketTripInfoRestoredState = mTicketTripInfoComponent.A;
                if (mTicketTripInfoRestoredState == null || (source = mTicketTripInfoRestoredState.f5775a) == null) {
                    source = initialisationIntent.f5767a;
                }
                return MTicketTripInfoDataState.a(mTicketTripInfoDataState, source, null, null, null, null, false, null, null, null, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            case 21:
                Magic_super_pass_table magic_super_pass_table = (Magic_super_pass_table) this.b;
                Magic_super_pass_tableQueries magic_super_pass_tableQueries = (Magic_super_pass_tableQueries) this.c;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, magic_super_pass_table.f1964a);
                execute3.bindString(1, magic_super_pass_table.b);
                execute3.bindString(2, magic_super_pass_table.c);
                execute3.bindString(3, magic_super_pass_table.d);
                execute3.bindString(4, (String) magic_super_pass_tableQueries.b.f1965a.encode(magic_super_pass_table.e));
                execute3.bindString(5, magic_super_pass_table.f);
                execute3.bindString(6, magic_super_pass_table.g);
                Magic_super_pass_table.Adapter adapter2 = magic_super_pass_tableQueries.b;
                execute3.bindString(7, (String) adapter2.b.encode(magic_super_pass_table.h));
                execute3.d(8, Long.valueOf(magic_super_pass_table.i));
                execute3.d(9, Long.valueOf(magic_super_pass_table.j));
                execute3.d(10, Long.valueOf(magic_super_pass_table.k));
                execute3.d(11, Long.valueOf(magic_super_pass_table.l));
                execute3.b(12, Boolean.valueOf(magic_super_pass_table.m));
                execute3.bindString(13, (String) adapter2.c.encode(magic_super_pass_table.n));
                execute3.d(14, Long.valueOf(magic_super_pass_table.o));
                execute3.d(15, Long.valueOf(magic_super_pass_table.p));
                execute3.bindString(16, (String) adapter2.d.encode(magic_super_pass_table.q));
                execute3.bindString(17, (String) adapter2.e.encode(magic_super_pass_table.r));
                execute3.d(18, Long.valueOf(magic_super_pass_table.s));
                execute3.bindString(19, magic_super_pass_table.t);
                execute3.bindString(20, magic_super_pass_table.u);
                execute3.bindString(21, magic_super_pass_table.v);
                execute3.bindString(22, magic_super_pass_table.w);
                execute3.bindString(23, magic_super_pass_table.x);
                execute3.bindString(24, magic_super_pass_table.y);
                execute3.bindString(25, (String) adapter2.f.encode(magic_super_pass_table.z));
                execute3.bindString(26, magic_super_pass_table.A);
                execute3.bindString(27, magic_super_pass_table.B);
                execute3.bindString(28, magic_super_pass_table.C);
                execute3.d(29, Long.valueOf(magic_super_pass_table.D));
                execute3.c(30, Double.valueOf(magic_super_pass_table.E));
                execute3.c(31, Double.valueOf(magic_super_pass_table.F));
                execute3.b(32, Boolean.valueOf(magic_super_pass_table.G));
                execute3.c(33, Double.valueOf(magic_super_pass_table.H));
                execute3.bindString(34, (String) adapter2.g.encode(magic_super_pass_table.I));
                execute3.b(35, Boolean.valueOf(magic_super_pass_table.J));
                execute3.bindString(36, magic_super_pass_table.K);
                execute3.bindString(37, magic_super_pass_table.L);
                execute3.d(38, Long.valueOf(magic_super_pass_table.M));
                execute3.d(39, Long.valueOf(magic_super_pass_table.N));
                execute3.b(40, Boolean.valueOf(magic_super_pass_table.O));
                execute3.b(41, Boolean.valueOf(magic_super_pass_table.P));
                execute3.bindString(42, magic_super_pass_table.Q);
                execute3.bindString(43, magic_super_pass_table.R);
                execute3.bindString(44, magic_super_pass_table.S);
                execute3.bindString(45, magic_super_pass_table.T);
                execute3.bindString(46, magic_super_pass_table.U);
                execute3.bindString(47, magic_super_pass_table.V);
                execute3.bindString(48, magic_super_pass_table.W);
                RefundInfoEntityModel refundInfoEntityModel = magic_super_pass_table.X;
                execute3.bindString(49, refundInfoEntityModel != null ? (String) adapter2.h.encode(refundInfoEntityModel) : null);
                execute3.bindString(50, (String) adapter2.i.encode(magic_super_pass_table.Y));
                execute3.d(51, magic_super_pass_table.Z);
                execute3.d(52, magic_super_pass_table.a0);
                execute3.b(53, magic_super_pass_table.b0);
                PremiumBusMeta premiumBusMeta = magic_super_pass_table.c0;
                execute3.bindString(54, premiumBusMeta != null ? (String) adapter2.j.encode(premiumBusMeta) : null);
                execute3.b(55, magic_super_pass_table.d0);
                return Unit.f17538a;
            case 22:
                MetroLandingScreenComponent metroLandingScreenComponent = (MetroLandingScreenComponent) this.b;
                StopAppModel stopAppModel = (StopAppModel) this.c;
                MetroLandingScreenDataState it6 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it6, "it");
                return MetroLandingScreenDataState.a(it6, false, null, null, null, null, null, null, null, null, null, ((MetroLandingScreenDataState) metroLandingScreenComponent.f.getValue()).l, stopAppModel, null, 5119);
            case 23:
                MetroLineListItemState metroLineListItemState = (MetroLineListItemState) this.b;
                RecentStopAndRouteBasedAppModel recentStopAndRouteBasedAppModel = (RecentStopAndRouteBasedAppModel) this.c;
                MetroLandingScreenDataState it7 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it7, "it");
                return MetroLandingScreenDataState.a(it7, false, null, null, null, null, null, null, null, null, metroLineListItemState, recentStopAndRouteBasedAppModel.f, recentStopAndRouteBasedAppModel.g, null, 4607);
            case 24:
                ArrayList arrayList = (ArrayList) this.b;
                MetroLineListItemState metroLineListItemState2 = (MetroLineListItemState) this.c;
                MetroLandingScreenDataState it8 = (MetroLandingScreenDataState) obj;
                Intrinsics.i(it8, "it");
                return MetroLandingScreenDataState.a(it8, false, null, null, null, null, null, arrayList, null, null, metroLineListItemState2, null, null, MetroLandingScreenBottomSheetType.None, 447);
            case 25:
                return MetroLandingScreenDataState.a((MetroLandingScreenDataState) obj, false, null, null, null, null, null, null, null, null, null, (StopAppModel) this.b, (StopAppModel) this.c, null, 5119);
            case 26:
                Metro_ticket_tableQueries metro_ticket_tableQueries = (Metro_ticket_tableQueries) this.b;
                List list3 = (List) this.c;
                metro_ticket_tableQueries.f697a.A0(177153319, "DELETE FROM metro_ticket_table", null);
                metro_ticket_tableQueries.T(177153319, new qi0(7));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    metro_ticket_tableQueries.a0(MetroTicketEntityMapperKt.a((MetroTicketEntity) it9.next()));
                }
                return Unit.f17538a;
            case 27:
                Metro_ticket_table metro_ticket_table = (Metro_ticket_table) this.b;
                Metro_ticket_tableQueries metro_ticket_tableQueries2 = (Metro_ticket_tableQueries) this.c;
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, metro_ticket_table.f1966a);
                execute4.bindString(1, metro_ticket_table.b);
                execute4.d(2, Long.valueOf(metro_ticket_table.c));
                execute4.d(3, Long.valueOf(metro_ticket_table.d));
                Metro_ticket_table.Adapter adapter3 = metro_ticket_tableQueries2.b;
                execute4.bindString(4, (String) adapter3.f1967a.encode(metro_ticket_table.e));
                execute4.d(5, metro_ticket_table.f);
                execute4.bindString(6, metro_ticket_table.g);
                execute4.bindString(7, metro_ticket_table.h);
                List list4 = metro_ticket_table.i;
                execute4.bindString(8, list4 != null ? (String) adapter3.b.encode(list4) : null);
                execute4.bindString(9, metro_ticket_table.j);
                execute4.d(10, metro_ticket_table.k);
                Map map3 = metro_ticket_table.l;
                execute4.bindString(11, map3 != null ? (String) adapter3.c.encode(map3) : null);
                execute4.bindString(12, metro_ticket_table.m);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity = metro_ticket_table.n;
                execute4.bindString(13, metroTicketStopDetailsEntity != null ? (String) adapter3.d.encode(metroTicketStopDetailsEntity) : null);
                MetroTicketStopDetailsEntity metroTicketStopDetailsEntity2 = metro_ticket_table.o;
                execute4.bindString(14, metroTicketStopDetailsEntity2 != null ? (String) adapter3.e.encode(metroTicketStopDetailsEntity2) : null);
                RefundInfoAppModel refundInfoAppModel = metro_ticket_table.p;
                execute4.bindString(15, refundInfoAppModel != null ? (String) adapter3.f.encode(refundInfoAppModel) : null);
                return Unit.f17538a;
            case 28:
                MinKycOtpIntent.OtpEnteredIntent otpEnteredIntent = (MinKycOtpIntent.OtpEnteredIntent) this.b;
                MinKycOtpComponent minKycOtpComponent = (MinKycOtpComponent) this.c;
                MinKycOtpDataState it10 = (MinKycOtpDataState) obj;
                Intrinsics.i(it10, "it");
                String str2 = otpEnteredIntent.f4150a;
                return MinKycOtpDataState.a(it10, str2, null, null, false, str2.length() == ((MinKycOtpDataState) minKycOtpComponent.f.getValue()).b, 0L, false, null, null, null, null, null, 16350);
            default:
                MinKycOtpDataState minKycOtpDataState = (MinKycOtpDataState) this.b;
                Function1 function1 = (Function1) this.c;
                String it11 = (String) obj;
                Intrinsics.i(it11, "it");
                StringBuilder sb = new StringBuilder();
                int length = it11.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = it11.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string14 = sb.toString();
                if (string14.length() <= minKycOtpDataState.b) {
                    function1.invoke(new MinKycOtpIntent.OtpEnteredIntent(string14));
                }
                return Unit.f17538a;
        }
    }
}
