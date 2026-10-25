package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.State;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.UIShape;
import app.chalo.core.Multi_modal_group_ticket_table;
import app.chalo.core.Multi_modal_group_ticket_tableQueries;
import app.chalo.core.Ondc_ticket_receipt_table;
import app.chalo.core.Ondc_ticket_receipt_tableQueries;
import app.chalo.core.Ondc_ticket_tableQueries;
import app.chalo.core.Pending_super_pass_table;
import app.chalo.core.Pending_super_pass_tableQueries;
import app.chalo.core.database.dao.OndcTicketDaoImpl;
import app.chalo.core.database.mappers.OndcTicketEntityMapperKt;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4;
import app.chalo.core.database.tableadapters.MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsDataInfo;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.home.ui.history.MyTicketHelperKt;
import app.chalo.home.ui.history.MyTicketHelperKt$getTicketsPageGridItems$$inlined$sortedBy$1;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.MyTicketsViewIntent;
import app.chalo.home.ui.history.TicketsPageGridItemData;
import app.chalo.home.ui.history.TicketsPassesTabType;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.homescreen.data.model.app.TicketsPassesAppModel;
import app.chalo.homescreen.data.model.app.TicketsPassesSectionWidgetAppModel;
import app.chalo.homescreen.data.model.app.TicketsTabHooksCardSectionData;
import app.chalo.location.LatLng;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeSuccessBottomSheetType;
import app.chalo.ondc.dao.OndcTicketEntity;
import app.chalo.premiumbus.domain.ChangeStopFailureReason;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsViewState;
import app.chalo.premiumbus.ui.changestop.ChangeStopFailureType;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenContent;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenState;
import app.chalo.premiumbus.ui.changestop.ComposableSingletons$PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMainScreenStopSectionType;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetails;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsIntent;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModelKt;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionDataState;
import app.chalo.productpurchase.passselection.ui.PassSelectionIntent;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenType;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import app.chalo.validationsdk.multiproductvalidation.ui.ActiveQrState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationDataState;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.Size;
import com.arkivanov.decompose.Child;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ej0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15559a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ej0(int i, Object obj, Object obj2) {
        this.f15559a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        NearbyStopsDataInfo nearbyStopsDataInfo;
        Object obj2;
        Object obj3;
        int i;
        Map mapD;
        List list;
        ChangeStopFailureType changeStopFailureType;
        int i2 = this.f15559a;
        int i3 = 9;
        int i4 = 0;
        Unit unit = Unit.f17538a;
        String strA = null;
        strA = null;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i2) {
            case 0:
                ArrayList arrayList4 = (ArrayList) obj4;
                MinProfileUpdateDataState it = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it, "it");
                boolean z = ((MinProfileInputState) obj5) instanceof MinProfileInputState.ProfilePhotoInput;
                BitmapImage bitmapImage = z ? null : it.g;
                if (z) {
                    UserProfileAppModel userProfileAppModel = it.f10390a;
                    if (userProfileAppModel != null) {
                        str = userProfileAppModel.c;
                    } else {
                        str2 = null;
                    }
                    return MinProfileUpdateDataState.a(it, null, arrayList4, null, 0, false, str2, bitmapImage, null, 157);
                }
                str = it.f;
                str2 = str;
                return MinProfileUpdateDataState.a(it, null, arrayList4, null, 0, false, str2, bitmapImage, null, 157);
            case 1:
                return ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$23$lambda$22((SheetState) obj5, (Animatable) obj4, (GraphicsLayerScope) obj);
            case 2:
                QRValidationLifecycleResult qRValidationLifecycleResult = (QRValidationLifecycleResult) obj5;
                ProductValidationData productValidationData = (ProductValidationData) obj4;
                MultiProductValidationDataState it2 = (MultiProductValidationDataState) obj;
                Intrinsics.i(it2, "it");
                ActiveQrState activeQrState = it2.d;
                List qrData = qRValidationLifecycleResult.f10519a;
                boolean z2 = qRValidationLifecycleResult.c;
                boolean z3 = qRValidationLifecycleResult.b;
                boolean z4 = (z3 || z2 || qrData.isEmpty()) ? false : activeQrState.b;
                activeQrState.getClass();
                Intrinsics.i(qrData, "qrData");
                ActiveQrState activeQrState2 = new ActiveQrState(qrData, z4, false);
                List<MultiProductChildState> list2 = it2.b;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.v(list2, 10));
                for (MultiProductChildState multiProductChildStateA : list2) {
                    if (multiProductChildStateA.f10688a.getId().equals(productValidationData.getId())) {
                        multiProductChildStateA = MultiProductChildState.a(multiProductChildStateA, z3, z2);
                    }
                    arrayList5.add(multiProductChildStateA);
                }
                return MultiProductValidationDataState.a(it2, arrayList5, null, activeQrState2, false, 21);
            case 3:
                Multi_modal_group_ticket_table multi_modal_group_ticket_table = (Multi_modal_group_ticket_table) obj5;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, multi_modal_group_ticket_table.f1970a);
                execute.bindString(1, multi_modal_group_ticket_table.b);
                execute.bindString(2, multi_modal_group_ticket_table.c);
                execute.bindString(3, multi_modal_group_ticket_table.d);
                execute.d(4, Long.valueOf(multi_modal_group_ticket_table.e));
                execute.d(5, Long.valueOf(multi_modal_group_ticket_table.f));
                Multi_modal_group_ticket_table.Adapter adapter = ((Multi_modal_group_ticket_tableQueries) obj4).b;
                execute.bindString(6, (String) adapter.f1971a.encode(multi_modal_group_ticket_table.g));
                execute.bindString(7, multi_modal_group_ticket_table.h);
                execute.bindString(8, multi_modal_group_ticket_table.i);
                execute.bindString(9, multi_modal_group_ticket_table.j);
                execute.d(10, Long.valueOf(multi_modal_group_ticket_table.k));
                execute.bindString(11, (String) adapter.b.encode(multi_modal_group_ticket_table.l));
                execute.bindString(12, (String) adapter.c.encode(multi_modal_group_ticket_table.m));
                execute.bindString(13, (String) adapter.d.encode(multi_modal_group_ticket_table.n));
                RefundInfoEntityModel refundInfoEntityModel = multi_modal_group_ticket_table.o;
                execute.bindString(14, refundInfoEntityModel != null ? (String) adapter.e.encode(refundInfoEntityModel) : null);
                execute.bindString(15, (String) adapter.f.encode(multi_modal_group_ticket_table.p));
                execute.bindString(16, (String) adapter.g.encode(multi_modal_group_ticket_table.q));
                execute.d(17, Long.valueOf(multi_modal_group_ticket_table.r));
                return unit;
            case 4:
                ik0 ik0Var = (ik0) obj5;
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                String string = sqlCursor.getString(1);
                String strJ = cb0.j(string, sqlCursor, 2);
                String string2 = sqlCursor.getString(3);
                Long lJ = uf0.j(string2, sqlCursor, 4);
                Long l = sqlCursor.getLong(5);
                Intrinsics.f(l);
                Multi_modal_group_ticket_table.Adapter adapter2 = ((Multi_modal_group_ticket_tableQueries) obj4).b;
                Object objG = cb0.g(sqlCursor, 6, adapter2.f1971a);
                String string3 = sqlCursor.getString(7);
                String strJ2 = cb0.j(string3, sqlCursor, 8);
                String string4 = sqlCursor.getString(9);
                Long lJ2 = uf0.j(string4, sqlCursor, 10);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1 = adapter2.b;
                String string5 = sqlCursor.getString(11);
                Intrinsics.f(string5);
                Object objA = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1.a(string5);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2 = adapter2.c;
                String string6 = sqlCursor.getString(12);
                Intrinsics.f(string6);
                Object objA2 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2.a(string6);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3 = adapter2.d;
                String string7 = sqlCursor.getString(13);
                Intrinsics.f(string7);
                Object objA3 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3.a(string7);
                String string8 = sqlCursor.getString(14);
                RefundInfoEntityModel refundInfoEntityModel2 = string8 != null ? (RefundInfoEntityModel) adapter2.e.a(string8) : null;
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4 = adapter2.f;
                String string9 = sqlCursor.getString(15);
                Intrinsics.f(string9);
                Object objA4 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4.a(string9);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5 = adapter2.g;
                String string10 = sqlCursor.getString(16);
                Intrinsics.f(string10);
                Object objA5 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5.a(string10);
                Long l2 = sqlCursor.getLong(17);
                Intrinsics.f(l2);
                return ik0Var.a(strI, string, strJ, string2, lJ, l, objG, string3, strJ2, string4, lJ2, objA, objA2, objA3, refundInfoEntityModel2, objA4, objA5, l2, sqlCursor.getLong(18), sqlCursor.getString(19), sqlCursor.getString(20), sqlCursor.getString(21));
            case 5:
                ik0 ik0Var2 = (ik0) obj5;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                String string11 = sqlCursor2.getString(1);
                String strJ3 = cb0.j(string11, sqlCursor2, 2);
                String string12 = sqlCursor2.getString(3);
                Long lJ3 = uf0.j(string12, sqlCursor2, 4);
                Long l3 = sqlCursor2.getLong(5);
                Intrinsics.f(l3);
                Multi_modal_group_ticket_table.Adapter adapter3 = ((Multi_modal_group_ticket_tableQueries) obj4).b;
                Object objG2 = cb0.g(sqlCursor2, 6, adapter3.f1971a);
                String string13 = sqlCursor2.getString(7);
                String strJ4 = cb0.j(string13, sqlCursor2, 8);
                String string14 = sqlCursor2.getString(9);
                Long lJ4 = uf0.j(string14, sqlCursor2, 10);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$1 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$6 = adapter3.b;
                String string15 = sqlCursor2.getString(11);
                Intrinsics.f(string15);
                Object objA6 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$6.a(string15);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$2 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$7 = adapter3.c;
                String string16 = sqlCursor2.getString(12);
                Intrinsics.f(string16);
                Object objA7 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$7.a(string16);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$3 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$8 = adapter3.d;
                String string17 = sqlCursor2.getString(13);
                Intrinsics.f(string17);
                Object objA8 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$8.a(string17);
                String string18 = sqlCursor2.getString(14);
                RefundInfoEntityModel refundInfoEntityModel3 = string18 != null ? (RefundInfoEntityModel) adapter3.e.a(string18) : null;
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$4 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$9 = adapter3.f;
                String string19 = sqlCursor2.getString(15);
                Intrinsics.f(string19);
                Object objA9 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$9.a(string19);
                MultiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$5 multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$10 = adapter3.g;
                String string20 = sqlCursor2.getString(16);
                Intrinsics.f(string20);
                Object objA10 = multiModalGroupTicketTableAdapter$get$$inlined$jsonAdapter$10.a(string20);
                Long l4 = sqlCursor2.getLong(17);
                Intrinsics.f(l4);
                return ik0Var2.a(strI2, string11, strJ3, string12, lJ3, l3, objG2, string13, strJ4, string14, lJ4, objA6, objA7, objA8, refundInfoEntityModel3, objA9, objA10, l4, sqlCursor2.getLong(18), sqlCursor2.getString(19), sqlCursor2.getString(20), sqlCursor2.getString(21));
            case 6:
                MyTicketsViewIntent.MyTicketsPageInitializationIntent myTicketsPageInitializationIntent = (MyTicketsViewIntent.MyTicketsPageInitializationIntent) obj5;
                TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel ticketsTabHooksSectionWidgetAppModel = (TicketsPassesSectionWidgetAppModel.TicketsTabHooksSectionWidgetAppModel) obj4;
                MyTicketsDataState it3 = (MyTicketsDataState) obj;
                Intrinsics.i(it3, "it");
                TicketsPassesAppModel ticketsPassesAppModel = myTicketsPageInitializationIntent.f3423a;
                TabMetaDataAppModel tabMetaDataAppModel = ticketsPassesAppModel.b;
                TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel = ticketsPassesAppModel.f3816a;
                if (ticketsTabHooksSectionWidgetAppModel != null) {
                    ArrayList arrayList6 = new ArrayList();
                    for (TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData : CollectionsKt.v0(new MyTicketHelperKt$getTicketsPageGridItems$$inlined$sortedBy$1(), ticketsTabHooksSectionWidgetAppModel.d.f3820a)) {
                        ItemTextDataAppModel itemTextDataAppModel = ticketsTabHooksCardSectionData.d;
                        ChaloTextWithBackgroundData chaloTextWithBackgroundDataA = MyTicketHelperKt.a(itemTextDataAppModel.c);
                        List list3 = itemTextDataAppModel.f3757a;
                        if (list3 != null) {
                            List list4 = list3;
                            arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(MyTicketHelperKt.a((ChaloTextDataAppModel) it4.next()));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        List list5 = itemTextDataAppModel.b;
                        if (list5 != null) {
                            List list6 = list5;
                            arrayList3 = new ArrayList(CollectionsKt.v(list6, 10));
                            Iterator it5 = list6.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(MyTicketHelperKt.a((ChaloTextDataAppModel) it5.next()));
                            }
                        } else {
                            arrayList3 = null;
                        }
                        GridWidgetItemData gridWidgetItemData = new GridWidgetItemData(arrayList2, arrayList3, chaloTextWithBackgroundDataA);
                        String str3 = ticketsTabHooksCardSectionData.b;
                        String str4 = ticketsTabHooksCardSectionData.f3819a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        arrayList6.add(new TicketsPageGridItemData(new GridWidgetCardData(gridWidgetItemData, str3, ticketsTabHooksCardSectionData.f, str4), ticketsTabHooksCardSectionData.e));
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = null;
                }
                return MyTicketsDataState.a(it3, tabMetaDataAppModel, null, null, false, false, null, ticketsPassesSectionWidgetAppModel, null, arrayList, false, null, false, null, false, false, null, false, myTicketsPageInitializationIntent.f3423a.c, null, null, false, 33028862);
            case 7:
                MyTicketsDataState it6 = (MyTicketsDataState) obj;
                Intrinsics.i(it6, "it");
                TicketsPassesTabType ticketsPassesTabType = ((MyTicketsViewIntent.QuickFilterTabClickedIntent) obj5).f3430a;
                Boolean bool = (Boolean) ((MyTicketsComponent) obj4).t.getG().getValue();
                bool.getClass();
                return MyTicketsDataState.a(it6, null, null, null, false, false, ticketsPassesTabType, null, null, null, false, null, false, null, false, false, bool, false, null, null, null, false, 33357759);
            case 8:
                MyTicketsDataState myTicketsDataState = (MyTicketsDataState) obj;
                Boolean bool2 = (Boolean) ((MyTicketsComponent) obj5).t.getG().getValue();
                bool2.getClass();
                return MyTicketsDataState.a(myTicketsDataState, null, null, (List) obj4, false, false, null, null, null, null, false, null, false, null, false, false, bool2, false, null, null, null, false, 33355767);
            case 9:
                NativeAdView nativeAdView = (NativeAdView) obj5;
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                Intrinsics.i((Context) obj, "it");
                nativeAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                Context context = nativeAdView.getContext();
                Intrinsics.h(context, "getContext(...)");
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1040030285, true, new h3(25, nativeAdView, (Function2) obj4)));
                nativeAdView.addView(composeView);
                return nativeAdView;
            case 10:
                final NativeAdView nativeAdView2 = (NativeAdView) obj5;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                ProvidableCompositionLocal providableCompositionLocal2 = NativeAdViewKt.f801a;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                final qg0 qg0Var = new qg0(4, nativeAdView2, (NativeAd) obj4);
                nativeAdView2.post(qg0Var);
                return new DisposableEffectResult() { // from class: app.chalo.ads.NativeAdViewKt$NativeAdView$lambda$2$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        nativeAdView2.removeCallbacks(qg0Var);
                    }
                };
            case 11:
                NCMCOnlineRechargeViewState it7 = (NCMCOnlineRechargeViewState) obj;
                Intrinsics.i(it7, "it");
                return NCMCOnlineRechargeViewState.a(it7, null, false, false, null, null, (String) obj5, null, null, null, null, 0L, null, null, (NcmcOnlineRechargeSuccessBottomSheetType) obj4, 65503);
            case 12:
                NearbyStopsDataInfo nearbyStopsDataInfo2 = (NearbyStopsDataInfo) obj5;
                List dataAndMarker = (List) obj4;
                NearbyStopsMapState nearbyStopsMapState = (NearbyStopsMapState) obj;
                if (nearbyStopsDataInfo2 != null) {
                    LatLng latLng = nearbyStopsDataInfo2.f3140a;
                    if (dataAndMarker == null) {
                        dataAndMarker = nearbyStopsDataInfo2.b;
                    }
                    Intrinsics.i(latLng, "latLng");
                    Intrinsics.i(dataAndMarker, "dataAndMarker");
                    nearbyStopsDataInfo = new NearbyStopsDataInfo(latLng, dataAndMarker);
                } else {
                    nearbyStopsDataInfo = null;
                }
                return NearbyStopsMapState.a(nearbyStopsMapState, false, null, null, nearbyStopsDataInfo, false, null, null, null, null, null, null, false, 32751);
            case 13:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                Intrinsics.i(builder, "<this>");
                ((Function1) obj5).invoke(builder);
                ((k4) obj4).invoke(builder);
                return unit;
            case 14:
                OndcTicketDaoImpl ondcTicketDaoImpl = (OndcTicketDaoImpl) obj5;
                Ondc_ticket_tableQueries ondc_ticket_tableQueries = ondcTicketDaoImpl.f2065a;
                ondc_ticket_tableQueries.f697a.A0(-1562572589, "DELETE FROM ondc_ticket_table", null);
                ondc_ticket_tableQueries.T(-1562572589, new ln0(28));
                Iterator it8 = ((List) obj4).iterator();
                while (it8.hasNext()) {
                    ondcTicketDaoImpl.f2065a.a0(OndcTicketEntityMapperKt.a((OndcTicketEntity) it8.next()));
                }
                return unit;
            case 15:
                Ondc_ticket_receipt_table ondc_ticket_receipt_table = (Ondc_ticket_receipt_table) obj5;
                Ondc_ticket_receipt_tableQueries ondc_ticket_receipt_tableQueries = (Ondc_ticket_receipt_tableQueries) obj4;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, ondc_ticket_receipt_table.f1974a);
                execute2.d(1, Long.valueOf(ondc_ticket_receipt_table.b));
                execute2.d(2, Long.valueOf(ondc_ticket_receipt_table.c));
                execute2.bindString(3, ondc_ticket_receipt_table.d);
                execute2.bindString(4, ondc_ticket_receipt_table.e);
                execute2.bindString(5, ondc_ticket_receipt_table.f);
                execute2.bindString(6, ondc_ticket_receipt_table.g);
                execute2.bindString(7, ondc_ticket_receipt_table.h);
                execute2.bindString(8, ondc_ticket_receipt_table.i);
                execute2.bindString(9, ondc_ticket_receipt_table.j);
                execute2.bindString(10, ondc_ticket_receipt_table.k);
                execute2.bindString(11, ondc_ticket_receipt_table.l);
                Map map = ondc_ticket_receipt_table.m;
                execute2.bindString(12, map != null ? (String) ondc_ticket_receipt_tableQueries.b.f1975a.encode(map) : null);
                return unit;
            case 16:
                Function13 function13 = (Function13) obj5;
                Ondc_ticket_receipt_tableQueries ondc_ticket_receipt_tableQueries2 = (Ondc_ticket_receipt_tableQueries) obj4;
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                Object objI = cb0.i(sqlCursor3, "cursor", 0);
                Long l5 = sqlCursor3.getLong(1);
                Object objE = cb0.e(l5, sqlCursor3, 2);
                String string21 = sqlCursor3.getString(3);
                Object objJ = cb0.j(string21, sqlCursor3, 4);
                String string22 = sqlCursor3.getString(5);
                Object objJ2 = cb0.j(string22, sqlCursor3, 6);
                String string23 = sqlCursor3.getString(7);
                Object objJ3 = cb0.j(string23, sqlCursor3, 8);
                String string24 = sqlCursor3.getString(9);
                String strJ5 = cb0.j(string24, sqlCursor3, 10);
                Object string25 = sqlCursor3.getString(11);
                Intrinsics.f(string25);
                String string26 = sqlCursor3.getString(12);
                if (string26 != null) {
                    obj2 = objI;
                    obj3 = (Map) ondc_ticket_receipt_tableQueries2.b.f1975a.a(string26);
                } else {
                    obj2 = objI;
                    obj3 = null;
                }
                return function13.invoke(obj2, l5, objE, string21, objJ, string22, objJ2, string23, objJ3, string24, strJ5, string25, obj3);
            case 17:
                return Operations.toCollectionString$lambda$0((Operations) obj5, (String) obj4, obj);
            case 18:
                Function2 function2 = (Function2) obj5;
                PBProductCardUiState pBProductCardUiState = (PBProductCardUiState) obj4;
                LayoutCoordinates lc = (LayoutCoordinates) obj;
                Intrinsics.i(lc, "lc");
                long jMo5941getSizeYbymL2g = lc.mo5941getSizeYbymL2g();
                int i5 = (int) (BodyPartID.bodyIdMax & jMo5941getSizeYbymL2g);
                if (i5 > 0 && (i = (int) (jMo5941getSizeYbymL2g >> 32)) > 0) {
                    DimensionKt.a(i);
                    Dimension.Pixels pixels = new Dimension.Pixels(i);
                    DimensionKt.a(i5);
                    function2.invoke(pBProductCardUiState.b.f10037a, new Size(pixels, new Dimension.Pixels(i5)));
                }
                return unit;
            case 19:
                LatLng location = (LatLng) obj;
                Intrinsics.i(location, "location");
                ((Function1) obj5).invoke(new PremiumBusStopDetailsIntent.OnDirectionClicked(location, ((PremiumBusStopDetails) obj4).b));
                return unit;
            case 20:
                ((Function1) obj5).invoke(new PremiumBusStopDetailsIntent.OnImageClicked(((Integer) obj).intValue(), (PBStopDetailsMainScreenStopSectionType) obj4));
                return unit;
            case 21:
                PassSelectionDataState it9 = (PassSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                BookingHelper bookingHelper = ((PassSelectionComponent) obj5).m;
                ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = ((PassSelectionDataState) obj4).e;
                bookingHelper.getClass();
                return PassSelectionDataState.a(it9, null, null, null, new PassSelectionScreenType.SubCategorySelection(BookingHelper.e(superPassConfigAppModel)), 383);
            case 22:
                PassSelectionIntent.SubCategorySelectedIntent subCategorySelectedIntent = (PassSelectionIntent.SubCategorySelectedIntent) obj5;
                PassSelectionComponent passSelectionComponent = (PassSelectionComponent) obj4;
                PassSelectionDataState it10 = (PassSelectionDataState) obj;
                Intrinsics.i(it10, "it");
                ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel2 = it10.e;
                String str5 = subCategorySelectedIntent.f8539a;
                Map map2 = it10.f;
                if (map2 != null) {
                    passSelectionComponent.m.getClass();
                    mapD = BookingHelper.b(str5, map2);
                } else {
                    mapD = MapsKt.d();
                }
                Map map3 = mapD;
                SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModelO0 = superPassConfigAppModel2 != null ? PassSelectionComponent.O0(superPassConfigAppModel2, subCategorySelectedIntent.f8539a) : null;
                Map mapD2 = it10.g;
                if (mapD2 == null) {
                    mapD2 = MapsKt.d();
                }
                Map map4 = mapD2;
                if (superPassConfigAppModel2 != null && (list = superPassConfigAppModel2.K) != null) {
                    strA = ProductConfigCompleteDetailsListAppModelKt.a(list, ProductImageType.PRODUCT_SOCIAL_VALIDATION_URL);
                }
                return PassSelectionDataState.a(it10, null, null, null, new PassSelectionScreenType.PassSelection(str5, map3, map4, superPassProductConfigSubCategoryResponseAppModelO0, strA), 383);
            case 23:
                UriHandler uriHandler = (UriHandler) obj4;
                int iIntValue = ((Integer) obj).intValue();
                AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.H(((AnnotatedString) obj5).getStringAnnotations("URL", iIntValue, iIntValue));
                if (range != null) {
                    Object item = range.getItem();
                    String str6 = (String) (StringsKt.F((String) item) ? null : item);
                    if (str6 != null) {
                        uriHandler.openUri(str6);
                    }
                }
                return unit;
            case 24:
                Pending_super_pass_tableQueries pending_super_pass_tableQueries = (Pending_super_pass_tableQueries) obj5;
                Pending_super_pass_table pending_super_pass_table = (Pending_super_pass_table) obj4;
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, (String) pending_super_pass_tableQueries.b.f1979a.encode(pending_super_pass_table.f1978a));
                execute3.bindString(1, pending_super_pass_table.b);
                execute3.bindString(2, pending_super_pass_table.c);
                Pending_super_pass_table.Adapter adapter4 = pending_super_pass_tableQueries.b;
                execute3.bindString(3, (String) adapter4.b.encode(pending_super_pass_table.d));
                execute3.bindString(4, pending_super_pass_table.e);
                execute3.bindString(5, pending_super_pass_table.f);
                execute3.c(6, Double.valueOf(pending_super_pass_table.g));
                execute3.bindString(7, pending_super_pass_table.h);
                execute3.d(8, Long.valueOf(pending_super_pass_table.i));
                execute3.bindString(9, (String) adapter4.c.encode(pending_super_pass_table.j));
                execute3.bindString(10, (String) adapter4.d.encode(pending_super_pass_table.k));
                execute3.d(11, Long.valueOf(pending_super_pass_table.l));
                execute3.bindString(12, pending_super_pass_table.m);
                execute3.bindString(13, pending_super_pass_table.n);
                execute3.bindString(14, pending_super_pass_table.o);
                execute3.bindString(15, pending_super_pass_table.p);
                execute3.bindString(16, pending_super_pass_table.q);
                execute3.bindString(17, pending_super_pass_table.r);
                execute3.bindString(18, (String) adapter4.e.encode(pending_super_pass_table.s));
                execute3.bindString(19, pending_super_pass_table.t);
                execute3.bindString(20, pending_super_pass_table.u);
                execute3.bindString(21, pending_super_pass_table.v);
                execute3.c(22, Double.valueOf(pending_super_pass_table.w));
                execute3.c(23, Double.valueOf(pending_super_pass_table.x));
                execute3.b(24, Boolean.valueOf(pending_super_pass_table.y));
                execute3.c(25, Double.valueOf(pending_super_pass_table.z));
                execute3.bindString(26, (String) adapter4.f.encode(pending_super_pass_table.A));
                execute3.b(27, Boolean.valueOf(pending_super_pass_table.B));
                execute3.bindString(28, pending_super_pass_table.C);
                execute3.bindString(29, pending_super_pass_table.D);
                execute3.d(30, Long.valueOf(pending_super_pass_table.E));
                execute3.d(31, Long.valueOf(pending_super_pass_table.F));
                execute3.d(32, Long.valueOf(pending_super_pass_table.G));
                execute3.b(33, Boolean.valueOf(pending_super_pass_table.H));
                execute3.bindString(34, pending_super_pass_table.I);
                execute3.bindString(35, pending_super_pass_table.J);
                execute3.bindString(36, pending_super_pass_table.K);
                RefundInfoEntityModel refundInfoEntityModel4 = pending_super_pass_table.L;
                execute3.bindString(37, refundInfoEntityModel4 != null ? (String) adapter4.g.encode(refundInfoEntityModel4) : null);
                return unit;
            case 25:
                final HashSet hashSet = (HashSet) obj5;
                final Child.Created created = (Child.Created) obj4;
                DisposableEffectScope DisposableEffect2 = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect2, "$this$DisposableEffect");
                hashSet.add(created.c);
                return new DisposableEffectResult() { // from class: com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.PredictiveBackAnimation$invoke$childContent$1$1$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        hashSet.remove(created.c);
                    }
                };
            case 26:
                String str7 = (String) obj4;
                PremiumBusChangeStopDataState premiumBusChangeStopDataState = (PremiumBusChangeStopDataState) obj;
                ChangeStopFailureReason changeStopFailureReason = (ChangeStopFailureReason) ((ChaloUseCaseResult.Failure) ((ChaloUseCaseResult) obj5)).f10418a;
                if ((changeStopFailureReason instanceof ChangeStopFailureReason.ServerError) || Intrinsics.d(changeStopFailureReason, ChangeStopFailureReason.LocalError.f7174a) || Intrinsics.d(changeStopFailureReason, ChangeStopFailureReason.ParseError.f7176a) || (changeStopFailureReason instanceof ChangeStopFailureReason.UnknownError) || Intrinsics.d(changeStopFailureReason, ChangeStopFailureReason.NoTicketReceived.f7175a) || Intrinsics.d(changeStopFailureReason, ChangeStopFailureReason.InvalidTicketReceived.f7173a) || Intrinsics.d(changeStopFailureReason, ChangeStopFailureReason.TicketParseError.f7180a)) {
                    changeStopFailureType = ChangeStopFailureType.GENERIC;
                } else if (changeStopFailureReason instanceof ChangeStopFailureReason.StopChangeWindowPassed) {
                    changeStopFailureType = ChangeStopFailureType.STOP_CHANGE_WINDOW_PASSED;
                } else {
                    if (!(changeStopFailureReason instanceof ChangeStopFailureReason.StopNotEligible)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    changeStopFailureType = ChangeStopFailureType.STOP_NOT_ELIGIBLE;
                }
                return PremiumBusChangeStopDataState.a(premiumBusChangeStopDataState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChangeStopScreenState.Failure(changeStopFailureType, str7), 16383);
            case 27:
                ChangeStopScreenContent.StopList stopList = (ChangeStopScreenContent.StopList) obj5;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyListScope.CC.s(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-416349514, true, new rb(i3, stopList, (State) obj4)), 3, null);
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(544619946, true, new ot0(stopList, i4)), 3, null);
                final List list7 = stopList.c;
                LazyColumn.items(list7.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreenKt$StopListContent$lambda$10$0$0$0$1$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        list7.get(((Number) obj6).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopScreenKt$StopListContent$lambda$10$0$0$0$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj6;
                        int iIntValue2 = ((Number) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue3 = ((Number) obj9).intValue();
                        if ((iIntValue3 & 6) == 0) {
                            i6 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue3;
                        } else {
                            i6 = iIntValue3;
                        }
                        if ((iIntValue3 & 48) == 0) {
                            i6 |= composer.changed(iIntValue2) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i6 & 147) != 146, i6 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            PbStopInfoCardUIState pbStopInfoCardUIState = (PbStopInfoCardUIState) list7.get(iIntValue2);
                            composer.startReplaceGroup(84624150);
                            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
                            UIShape.Rectangle rectangle = UIShape.f1926a;
                            PremiumBusChangeStopComposablesKt.b(modifierM786paddingVpY3zN4$default, pbStopInfoCardUIState, composer, 0);
                            ChaloSpacersKt.o(composer, 0);
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
                LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$PremiumBusChangeStopScreenKt.f7523a, 3, null);
                return unit;
            case 28:
                PremiumBusProductModificationReasonsViewState it11 = (PremiumBusProductModificationReasonsViewState) obj;
                Intrinsics.i(it11, "it");
                return PremiumBusProductModificationReasonsViewState.a(it11, null, null, null, null, null, false, null, null, true, null, (PremiumBusProductModificationReasonAppModel) obj5, null, (String) obj4, null, null, 54783);
            default:
                return PremiumBusProductModificationReasonsViewState.a((PremiumBusProductModificationReasonsViewState) obj, null, null, null, (PremiumBusBottomSheetTypeUIState.ViewAllSlots) obj5, null, false, null, null, false, ((PremiumBusProductModificationReasonsIntent.SlotClickedIntent) obj4).f7349a, null, null, null, null, null, 64495);
        }
    }
}
