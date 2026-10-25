package app.chalo.models;

import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigBrandingAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeFareInfoAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardRechargeConfigurationKt {
    public static final CardRechargeConfiguration a(ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel) {
        ProductBranding productBranding;
        Intrinsics.i(chaloCardRechargeConfigAppModel, "<this>");
        String str = chaloCardRechargeConfigAppModel.f6126a;
        String str2 = chaloCardRechargeConfigAppModel.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = chaloCardRechargeConfigAppModel.g;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = chaloCardRechargeConfigAppModel.j;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = chaloCardRechargeConfigAppModel.k;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = chaloCardRechargeConfigAppModel.l;
        if (str6 == null) {
            str6 = "";
        }
        ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel = chaloCardRechargeConfigAppModel.b;
        Long l = chaloCardRechargeFareInfoAppModel.f6132a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = chaloCardRechargeFareInfoAppModel.b;
        long jLongValue2 = l2 != null ? l2.longValue() : 1L;
        List list = chaloCardRechargeFareInfoAppModel.c;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        CardRechargeFareInfo cardRechargeFareInfo = new CardRechargeFareInfo(list, jLongValue, jLongValue2);
        ChaloCardRechargeConfigBrandingAppModel chaloCardRechargeConfigBrandingAppModel = chaloCardRechargeConfigAppModel.h;
        if (chaloCardRechargeConfigBrandingAppModel != null) {
            Boolean bool = chaloCardRechargeConfigBrandingAppModel.f6128a;
            productBranding = new ProductBranding(bool != null ? bool.booleanValue() : false);
        } else {
            productBranding = new ProductBranding(false);
        }
        ProductBranding productBranding2 = productBranding;
        List list2 = chaloCardRechargeConfigAppModel.i;
        List listD = list2 != null ? CollectionsKt.D(list2) : EmptyList.f17557a;
        String str7 = chaloCardRechargeConfigAppModel.m;
        String str8 = str7 != null ? str7 : "";
        Boolean bool2 = chaloCardRechargeConfigAppModel.c;
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : true;
        Integer num = chaloCardRechargeConfigAppModel.d;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = chaloCardRechargeConfigAppModel.e;
        return new CardRechargeConfiguration(str, str2, str3, str4, str5, str6, cardRechargeFareInfo, productBranding2, listD, str8, zBooleanValue, iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
    }
}
