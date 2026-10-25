package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import app.cash.sqldelight.QueryKt;
import app.cash.sqldelight.db.SqlCursor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.ads.NativeAdViewKt;
import app.chalo.core.Mticket_activation_store_table;
import app.chalo.core.Multi_modal_group_ticket_child_table;
import app.chalo.core.Multi_modal_group_ticket_tableQueries;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl;
import app.chalo.core.networkinspector.NetworkInspectorIntent;
import app.chalo.core.networkinspector.NetworkInspectorState;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapIntent;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsComponent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsDataState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsIntent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsRestoredDataState;
import app.chalo.kyc.min.ui.minkycdetails.NameRegistrationUIState;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpIntent;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.ui.composables.StepModeCardComposableKt;
import app.chalo.multimodalticket.ui.uistates.StepTicketSectionUIState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.uistate.dialog.MultiSelectDatePickerEventHandler;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateIntent;
import com.google.android.gms.ads.nativead.AdChoicesView;
import com.google.android.gms.ads.nativead.NativeAdView;
import defpackage.pk0;
import io.ktor.http.ContentType;
import io.ktor.http.MimesKt;
import io.ktor.http.cio.HttpHeadersMap;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.util.TextKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class wi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19931a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi0(Object obj, int i) {
        this.f19931a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.f19931a;
        int i2 = 2;
        Unit unit = Unit.f17538a;
        int i3 = 1;
        int i4 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String ext = (String) obj;
                Lazy lazy = MimesKt.f16805a;
                Intrinsics.i(ext, "ext");
                return new Pair(TextKt.b(ext), (ContentType) obj2);
            case 1:
                MinKycDetailsDataState it = (MinKycDetailsDataState) obj;
                Intrinsics.i(it, "it");
                return MinKycDetailsDataState.a(it, null, false, false, ((MinKycDetailsIntent.FocusChanged) obj2).f4120a, false, 23);
            case 2:
                MinKycDetailsDataState it2 = (MinKycDetailsDataState) obj;
                Intrinsics.i(it2, "it");
                String str2 = ((MinKycDetailsIntent.FullNameEnteredIntent) obj2).f4121a;
                return MinKycDetailsDataState.a(it2, str2, str2.length() > 0, false, false, false, 28);
            case 3:
                MinKycDetailsDataState minKycDetailsDataState = (MinKycDetailsDataState) obj;
                MinKycDetailsRestoredDataState minKycDetailsRestoredDataState = ((MinKycDetailsComponent) obj2).p;
                if (minKycDetailsRestoredDataState == null || (str = minKycDetailsRestoredDataState.f4124a) == null) {
                    str = "";
                }
                return MinKycDetailsDataState.a(minKycDetailsDataState, str, false, false, false, true, 8);
            case 4:
                FocusState focusState = (FocusState) obj;
                Intrinsics.i(focusState, "focusState");
                ((NameRegistrationUIState) obj2).d.b.a(focusState.isFocused());
                return unit;
            case 5:
                MinKycOtpDataState it3 = (MinKycOtpDataState) obj;
                Intrinsics.i(it3, "it");
                long j = ((MinKycOtpIntent.OnResendOtpEnableCountdownUpdate) obj2).f4149a;
                return MinKycOtpDataState.a(it3, null, null, null, false, false, j, j <= 0, null, null, null, null, null, 16191);
            case 6:
                MinProfileUpdateDataState it4 = (MinProfileUpdateDataState) obj;
                Intrinsics.i(it4, "it");
                BitmapImage bitmapImage = ((MinProfileUpdateIntent.ProfilePhotoSelected) obj2).f10403a;
                ArrayList arrayListE0 = CollectionsKt.E0(it4.b);
                int i5 = it4.d;
                if (((MinProfileInputState) CollectionsKt.L(i5, arrayListE0)) instanceof MinProfileInputState.ProfilePhotoInput) {
                    arrayListE0.set(i5, new MinProfileInputState.ProfilePhotoInput(false));
                }
                return MinProfileUpdateDataState.a(it4, null, arrayListE0, null, 0, false, null, bitmapImage, null, 157);
            case 7:
                return MovableContentState.extractNestedStates$lambda$1((MovableContentState) obj2, (MovableContentStateReference) obj);
            case 8:
                Mticket_activation_store_table mticket_activation_store_table = (Mticket_activation_store_table) obj2;
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, mticket_activation_store_table.f1968a);
                execute.bindString(1, mticket_activation_store_table.b);
                execute.d(2, Long.valueOf(mticket_activation_store_table.c));
                execute.b(3, Boolean.valueOf(mticket_activation_store_table.d));
                return unit;
            case 9:
                MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl = (MultiModalGroupTicketDaoImpl) obj2;
                List listB = QueryKt.a(1745381666, new String[]{"multi_modal_group_ticket_table"}, multiModalGroupTicketDaoImpl.f2055a.f697a, "multi_modal_group_ticket_table.sq", "getAllStoredGroups", "SELECT groupId\nFROM multi_modal_group_ticket_table", new lj0(19)).b();
                multiModalGroupTicketDaoImpl.j(listB);
                List list = listB;
                if (!list.isEmpty()) {
                    multiModalGroupTicketDaoImpl.b.W(list);
                }
                Multi_modal_group_ticket_tableQueries multi_modal_group_ticket_tableQueries = multiModalGroupTicketDaoImpl.f2055a;
                multi_modal_group_ticket_tableQueries.f697a.A0(23635629, "DELETE FROM multi_modal_group_ticket_table", null);
                multi_modal_group_ticket_tableQueries.T(23635629, new lj0(20));
                return unit;
            case 10:
                final MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState multiModalTicketSelectionBottomSheetUiState = (MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                final List list2 = multiModalTicketSelectionBottomSheetUiState.d;
                LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.home.ui.history.compose.components.MultiModalTicketSelectionBottomSheetContentKt$MultiModalTicketSelectionBottomSheetContent$lambda$0$1$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        list2.get(((Number) obj3).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.home.ui.history.compose.components.MultiModalTicketSelectionBottomSheetContentKt$MultiModalTicketSelectionBottomSheetContent$lambda$0$1$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i6;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue2 = ((Number) obj6).intValue();
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
                            StepTicketSectionUIState stepTicketSectionUIState = (StepTicketSectionUIState) list2.get(iIntValue);
                            composer.startReplaceGroup(-444623800);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            StepModeCardComposableKt.a(null, stepTicketSectionUIState, composer, 64);
                            MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState multiModalTicketSelectionBottomSheetUiState2 = multiModalTicketSelectionBottomSheetUiState;
                            if (iIntValue != CollectionsKt.K(multiModalTicketSelectionBottomSheetUiState2.d)) {
                                composer.startReplaceGroup(1443237393);
                                DividerUIStateKt.a(null, multiModalTicketSelectionBottomSheetUiState2.e, composer, 0, 1);
                            } else {
                                composer.startReplaceGroup(1440740033);
                            }
                            composer.endReplaceGroup();
                            composer.endNode();
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
            case 11:
                LocalDateTime dateTime = (LocalDateTime) obj;
                Intrinsics.i(dateTime, "dateTime");
                ((MultiSelectDatePickerEventHandler) obj2).b(dateTime);
                return unit;
            case 12:
                SqlCursor sqlCursor = (SqlCursor) obj;
                String strI = cb0.i(sqlCursor, "cursor", 0);
                Long l = sqlCursor.getLong(1);
                String strN = uf0.n(l, sqlCursor, 2);
                String string = sqlCursor.getString(3);
                return ((or) obj2).invoke(strI, l, strN, string, cb0.j(string, sqlCursor, 4));
            case 13:
                or orVar = (or) obj2;
                SqlCursor sqlCursor2 = (SqlCursor) obj;
                String strI2 = cb0.i(sqlCursor2, "cursor", 0);
                Long l2 = sqlCursor2.getLong(1);
                String strN2 = uf0.n(l2, sqlCursor2, 2);
                String string2 = sqlCursor2.getString(3);
                return orVar.invoke(strI2, l2, strN2, string2, cb0.j(string2, sqlCursor2, 4));
            case 14:
                Multi_modal_group_ticket_child_table multi_modal_group_ticket_child_table = (Multi_modal_group_ticket_child_table) obj2;
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, multi_modal_group_ticket_child_table.f1969a);
                execute2.d(1, Long.valueOf(multi_modal_group_ticket_child_table.b));
                execute2.bindString(2, multi_modal_group_ticket_child_table.c);
                execute2.bindString(3, multi_modal_group_ticket_child_table.d);
                execute2.bindString(4, multi_modal_group_ticket_child_table.e);
                return unit;
            case 15:
                SqlCursor sqlCursor3 = (SqlCursor) obj;
                String strI3 = cb0.i(sqlCursor3, "cursor", 0);
                Long l3 = sqlCursor3.getLong(1);
                String strN3 = uf0.n(l3, sqlCursor3, 2);
                String string3 = sqlCursor3.getString(3);
                return ((or) obj2).invoke(strI3, l3, strN3, string3, cb0.j(string3, sqlCursor3, 4));
            case 16:
                SqlCursor sqlCursor4 = (SqlCursor) obj;
                String strI4 = cb0.i(sqlCursor4, "cursor", 0);
                Long l4 = sqlCursor4.getLong(1);
                String strN4 = uf0.n(l4, sqlCursor4, 2);
                String string4 = sqlCursor4.getString(3);
                return ((or) obj2).invoke(strI4, l4, strN4, string4, cb0.j(string4, sqlCursor4, 4));
            case 17:
                MultipartEvent.MultipartPart multipartPart = (MultipartEvent.MultipartPart) obj2;
                if (((Throwable) obj) != null) {
                    ((HttpHeadersMap) multipartPart.f16825a.l()).e();
                }
                return unit;
            case 18:
                MyTicketsDataState it5 = (MyTicketsDataState) obj;
                Intrinsics.i(it5, "it");
                return MyTicketsDataState.a(it5, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.MultiModalTicketSelectionBottomSheet((MultiModalGroupTicketAppModel) obj2), null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 19:
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                Intrinsics.i((Context) obj, "it");
                AdChoicesView adChoicesView = new AdChoicesView((Context) obj2);
                adChoicesView.setMinimumWidth(15);
                adChoicesView.setMinimumHeight(15);
                return adChoicesView;
            case 20:
                AdChoicesView view = (AdChoicesView) obj;
                ProvidableCompositionLocal providableCompositionLocal2 = NativeAdViewKt.f801a;
                Intrinsics.i(view, "view");
                ((NativeAdView) obj2).setAdChoicesView(view);
                return unit;
            case 21:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18((DrawerState) obj2, (Density) obj);
            case 22:
                NCMCOnlineRechargeIntent it6 = (NCMCOnlineRechargeIntent) obj;
                Intrinsics.i(it6, "it");
                ((NcmcOnlineRechargeComponent) obj2).G0(it6);
                return unit;
            case 23:
                TextFieldValue it7 = (TextFieldValue) obj;
                Intrinsics.i(it7, "it");
                ((TextFieldEventHandler) obj2).b(it7.getText());
                return unit;
            case 24:
                NearbyStopsMapState it8 = (NearbyStopsMapState) obj;
                Intrinsics.i(it8, "it");
                return NearbyStopsMapState.a(it8, false, null, null, null, false, null, null, null, null, null, null, ((NearbyStopsMapIntent.UpdateBottomSheetStateIntent) obj2).f3162a, 16383);
            case 25:
                NearbyStopsMapState it9 = (NearbyStopsMapState) obj;
                Intrinsics.i(it9, "it");
                return NearbyStopsMapState.a(it9, false, null, null, null, false, null, null, null, null, null, ((NearbyStopsMapIntent.OnMapCameraUpdateLoadedIntent) obj2).f3155a, false, 24575);
            case 26:
                NearbyStopsMapState it10 = (NearbyStopsMapState) obj;
                Intrinsics.i(it10, "it");
                return NearbyStopsMapState.a(it10, false, null, null, null, false, null, ((NearbyStopsMapIntent.MapCameraPositionStateChangedIntent) obj2).f3153a, null, null, null, null, false, 32639);
            case 27:
                NetworkInspectorState data = (NetworkInspectorState) obj;
                Intrinsics.i(data, "data");
                return NetworkInspectorState.a(data, ((NetworkInspectorIntent.OpenDetails) ((NetworkInspectorIntent) obj2)).f2302a, false, null, 13);
            case 28:
                NetworkInspectorState networkInspectorState = (NetworkInspectorState) obj;
                String message = ((Exception) obj2).getMessage();
                if (message == null) {
                    message = "Failed to load network calls";
                }
                return NetworkInspectorState.a(networkInspectorState, null, false, message, 3);
            default:
                NetworkCallInfo networkCallInfo = (NetworkCallInfo) obj2;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(280915053, true, new vm0(networkCallInfo, i4)), 3, null);
                LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-1713402012, true, new vm0(networkCallInfo, i3)), 3, null);
                LazyListScope.CC.m(LazyColumn2, null, null, ComposableLambdaKt.composableLambdaInstance(-1703631451, true, new vm0(networkCallInfo, i2)), 3, null);
                return unit;
        }
    }
}
