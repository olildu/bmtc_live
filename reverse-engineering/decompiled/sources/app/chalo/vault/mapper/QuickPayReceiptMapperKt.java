package app.chalo.vault.mapper;

import app.chalo.network.config.ChaloJson;
import app.chalo.receipt.ReceiptFareDataAppModel;
import app.chalo.vault.Quick_pay_receipt_table;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"vault_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuickPayReceiptMapperKt {
    public static final Quick_pay_receipt_table a(QuickPayReceipt quickPayReceipt) {
        String str;
        String str2;
        String strA;
        String schemeType;
        ReceiptFareDataAppModel receiptFareDataAppModel;
        String str3;
        String strA2;
        Intrinsics.i(quickPayReceipt, "<this>");
        String str4 = quickPayReceipt.f10932a;
        String str5 = quickPayReceipt.b;
        long j = quickPayReceipt.c;
        long j2 = quickPayReceipt.d;
        String str6 = quickPayReceipt.e;
        String str7 = quickPayReceipt.f;
        String str8 = quickPayReceipt.g;
        String str9 = quickPayReceipt.h;
        String str10 = quickPayReceipt.i;
        String str11 = quickPayReceipt.j;
        ChaloJson chaloJson = ChaloJson.f6455a;
        Map map = quickPayReceipt.k;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            str = str4;
            try {
                str2 = str5;
                try {
                    strA = json.a(BuiltinSerializersKt.c(new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a)), map);
                } catch (Exception unused) {
                    strA = null;
                }
            } catch (Exception unused2) {
                str2 = str5;
                strA = null;
                String str12 = quickPayReceipt.l;
                schemeType = quickPayReceipt.m.getSchemeType();
                String str13 = quickPayReceipt.n;
                String str14 = quickPayReceipt.o;
                String str15 = quickPayReceipt.p;
                String str16 = quickPayReceipt.q;
                String str17 = quickPayReceipt.r;
                String str18 = quickPayReceipt.s;
                String str19 = quickPayReceipt.t;
                ChaloJson chaloJson2 = ChaloJson.f6455a;
                receiptFareDataAppModel = quickPayReceipt.u;
                Json json2 = ChaloJson.b;
                json2.getClass();
                str3 = schemeType;
                try {
                    strA2 = json2.a(BuiltinSerializersKt.c(ReceiptFareDataAppModel.INSTANCE.serializer()), receiptFareDataAppModel);
                } catch (Exception unused3) {
                    strA2 = null;
                }
                return new Quick_pay_receipt_table(str, str2, j, j2, str6, str7, str8, str9, str10, str11, strA, str12, str3, str13, str14, str15, str16, str17, str18, str19, strA2);
            }
        } catch (Exception unused4) {
            str = str4;
        }
        String str110 = quickPayReceipt.l;
        schemeType = quickPayReceipt.m.getSchemeType();
        String str111 = quickPayReceipt.n;
        String str112 = quickPayReceipt.o;
        String str113 = quickPayReceipt.p;
        String str114 = quickPayReceipt.q;
        String str115 = quickPayReceipt.r;
        String str116 = quickPayReceipt.s;
        String str117 = quickPayReceipt.t;
        ChaloJson chaloJson3 = ChaloJson.f6455a;
        receiptFareDataAppModel = quickPayReceipt.u;
        try {
            Json json3 = ChaloJson.b;
            json3.getClass();
            str3 = schemeType;
            strA2 = json3.a(BuiltinSerializersKt.c(ReceiptFareDataAppModel.INSTANCE.serializer()), receiptFareDataAppModel);
        } catch (Exception unused5) {
            str3 = schemeType;
        }
        return new Quick_pay_receipt_table(str, str2, j, j2, str6, str7, str8, str9, str10, str11, strA, str110, str3, str111, str112, str113, str114, str115, str116, str117, strA2);
    }
}
