package defpackage;

import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountErrorType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xa implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20001a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ xa(long j, String str, int i) {
        this.f20001a = i;
        this.b = j;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BleValidationMetaData bleValidationMetaDataA;
        LinkedHashMap linkedHashMapU;
        LinkedHashMap linkedHashMapU2;
        switch (this.f20001a) {
            case 0:
                BleValidationState it = (BleValidationState) obj;
                Intrinsics.i(it, "it");
                BleValidationMetaData bleValidationMetaData = it.j;
                if (bleValidationMetaData != null) {
                    bleValidationMetaDataA = BleValidationMetaData.a(bleValidationMetaData, this.c, Long.valueOf(this.b));
                } else {
                    bleValidationMetaDataA = null;
                }
                return BleValidationState.a(it, null, null, null, null, null, false, null, false, null, bleValidationMetaDataA, 3583);
            case 1:
                ChaloCardRechargeAmountViewState it2 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it2, "it");
                return ChaloCardRechargeAmountViewState.a(it2, null, null, null, null, null, this.b, this.c, null, null, CardRechargeAmountErrorType.NoError.f6284a, false, false, null, null, null, null, null, false, null, 2093887);
            case 2:
                ChaloCardRechargeAmountViewState it3 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it3, "it");
                long j = this.b;
                return ChaloCardRechargeAmountViewState.a(it3, null, null, null, null, null, j, this.c, null, null, CardRechargeAmountErrorType.NoError.f6284a, j > 0, false, null, null, null, null, null, false, null, 2093887);
            case 3:
                SqlPreparedStatement sqlPreparedStatement = (SqlPreparedStatement) obj;
                uf0.x(sqlPreparedStatement, "$this$execute", this.b, 0);
                sqlPreparedStatement.bindString(1, this.c);
                return Unit.f17538a;
            case 4:
                return NCMCOnlineRechargeViewState.a((NCMCOnlineRechargeViewState) obj, null, false, true, this.c, null, null, null, Long.valueOf(this.b), null, null, 0L, null, null, null, 130915);
            case 5:
                PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState = (PremiumBusSlotSelectionDataState) obj;
                Map map = premiumBusSlotSelectionDataState.g;
                if (map != null) {
                    linkedHashMapU = MapsKt.u(map);
                    long j2 = this.b;
                    PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel = (PBODPairWithSlotSectionListUiModel) linkedHashMapU.get(Long.valueOf(j2));
                    if (pBODPairWithSlotSectionListUiModel != null) {
                        linkedHashMapU.put(Long.valueOf(j2), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel, null, null, false, 0, 0, false, false, 8191));
                    }
                } else {
                    linkedHashMapU = null;
                }
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState, false, false, false, null, null, null, linkedHashMapU, null, null, 0, null, null, null, true, this.c, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -98369);
            case 6:
                PremiumBusSlotSelectionDataState premiumBusSlotSelectionDataState2 = (PremiumBusSlotSelectionDataState) obj;
                Map map2 = premiumBusSlotSelectionDataState2.g;
                if (map2 != null) {
                    linkedHashMapU2 = MapsKt.u(map2);
                    long j3 = this.b;
                    PBODPairWithSlotSectionListUiModel pBODPairWithSlotSectionListUiModel2 = (PBODPairWithSlotSectionListUiModel) linkedHashMapU2.get(Long.valueOf(j3));
                    if (pBODPairWithSlotSectionListUiModel2 != null) {
                        linkedHashMapU2.put(Long.valueOf(j3), PBODPairWithSlotSectionListUiModel.a(pBODPairWithSlotSectionListUiModel2, null, null, false, 0, 0, false, false, 8191));
                    }
                } else {
                    linkedHashMapU2 = null;
                }
                return PremiumBusSlotSelectionDataState.a(premiumBusSlotSelectionDataState2, false, false, false, null, null, null, linkedHashMapU2, null, null, 0, null, null, null, true, this.c, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -98369);
            case 7:
                SqlPreparedStatement sqlPreparedStatement2 = (SqlPreparedStatement) obj;
                uf0.x(sqlPreparedStatement2, "$this$execute", this.b, 0);
                sqlPreparedStatement2.bindString(1, this.c);
                return Unit.f17538a;
            case 8:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                String str = this.c;
                execute.bindString(0, str);
                execute.bindString(1, str);
                long j4 = this.b;
                execute.d(2, Long.valueOf(j4));
                execute.bindString(3, str);
                execute.d(4, Long.valueOf(j4));
                return Unit.f17538a;
            case 9:
                SqlPreparedStatement sqlPreparedStatement3 = (SqlPreparedStatement) obj;
                uf0.x(sqlPreparedStatement3, "$this$execute", this.b, 0);
                sqlPreparedStatement3.bindString(1, this.c);
                return Unit.f17538a;
            case 10:
                SqlPreparedStatement sqlPreparedStatement4 = (SqlPreparedStatement) obj;
                uf0.x(sqlPreparedStatement4, "$this$execute", this.b, 0);
                sqlPreparedStatement4.bindString(1, this.c);
                return Unit.f17538a;
            default:
                SqlPreparedStatement sqlPreparedStatement5 = (SqlPreparedStatement) obj;
                uf0.x(sqlPreparedStatement5, "$this$execute", this.b, 0);
                sqlPreparedStatement5.bindString(1, this.c);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ xa(String str, long j, int i) {
        this.f20001a = i;
        this.c = str;
        this.b = j;
    }
}
