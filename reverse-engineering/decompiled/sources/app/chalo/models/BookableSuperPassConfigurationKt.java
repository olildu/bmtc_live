package app.chalo.models;

import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.ApplicableRuleUxCopyAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BookableSuperPassConfigurationKt {
    public static final ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen a(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        List list;
        if (bookableSuperPassConfiguration != null && (superPassProductConfigFareMappingResponseAppModel = bookableSuperPassConfiguration.c) != null && (list = superPassProductConfigFareMappingResponseAppModel.u) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = ((ApplicableRuleAppModel) it.next()).f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen) {
                        arrayList.add(obj);
                    }
                }
                ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen passPurchaseConfirmationScreen = (ApplicableRuleUxCopyAppModel.PassPurchaseConfirmationScreen) ((ApplicableRuleUxCopyAppModel) CollectionsKt.H(arrayList));
                if (passPurchaseConfirmationScreen != null) {
                    return passPurchaseConfirmationScreen;
                }
            }
        }
        return null;
    }

    public static final boolean b(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
        Intrinsics.i(bookableSuperPassConfiguration, "<this>");
        return !bookableSuperPassConfiguration.c.m;
    }
}
