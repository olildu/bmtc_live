package app.chalo.premiumbus.data;

import app.chalo.premiumbus.data.models.app.PassTierType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassValidationPropertiesAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassValidationPropertiesAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassStatusAppModel f6977a;
    public final long b;
    public final long c;
    public final List d;
    public final Integer e;
    public final Integer f;
    public final List g;
    public final PassTierType h;
    public final Integer i;

    public SuperPassValidationPropertiesAppModel(SuperPassStatusAppModel superPassStatusAppModel, long j, long j2, List serviceType, Integer num, Integer num2, List list, PassTierType passTierType, Integer num3) {
        Intrinsics.i(serviceType, "serviceType");
        Intrinsics.i(passTierType, "passTierType");
        this.f6977a = superPassStatusAppModel;
        this.b = j;
        this.c = j2;
        this.d = serviceType;
        this.e = num;
        this.f = num2;
        this.g = list;
        this.h = passTierType;
        this.i = num3;
    }

    public final int a() {
        Integer num;
        Integer num2 = this.e;
        if (num2 == null || (num = this.f) == null) {
            return -1;
        }
        int iIntValue = (num != null && num.intValue() == -1) ? 0 : num.intValue();
        if (num2 != null && num2.intValue() == -1) {
            return num2.intValue();
        }
        int iIntValue2 = (num2.intValue() - this.g.size()) - iIntValue;
        if (iIntValue2 > 0) {
            return iIntValue2;
        }
        return 0;
    }
}
