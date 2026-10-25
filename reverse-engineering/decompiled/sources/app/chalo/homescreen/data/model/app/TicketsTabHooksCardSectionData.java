package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsTabHooksCardSectionData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketsTabHooksCardSectionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3819a;
    public final String b;
    public final int c;
    public final ItemTextDataAppModel d;
    public final TicketsPageFeature e;
    public final IconType f;

    public TicketsTabHooksCardSectionData(String str, String str2, int i, ItemTextDataAppModel itemTextDataAppModel, TicketsPageFeature hookType, IconType iconType) {
        Intrinsics.i(hookType, "hookType");
        this.f3819a = str;
        this.b = str2;
        this.c = i;
        this.d = itemTextDataAppModel;
        this.e = hookType;
        this.f = iconType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsTabHooksCardSectionData)) {
            return false;
        }
        TicketsTabHooksCardSectionData ticketsTabHooksCardSectionData = (TicketsTabHooksCardSectionData) obj;
        return Intrinsics.d(this.f3819a, ticketsTabHooksCardSectionData.f3819a) && Intrinsics.d(this.b, ticketsTabHooksCardSectionData.b) && this.c == ticketsTabHooksCardSectionData.c && Intrinsics.d(this.d, ticketsTabHooksCardSectionData.d) && this.e == ticketsTabHooksCardSectionData.e && this.f == ticketsTabHooksCardSectionData.f;
    }

    public final int hashCode() {
        String str = this.f3819a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c) * 31)) * 31)) * 31;
        IconType iconType = this.f;
        return iHashCode2 + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TicketsTabHooksCardSectionData(itemBgColor=", this.f3819a, ", itemImageUrl=", this.b, ", itemPosition=");
        sbE.append(this.c);
        sbE.append(", itemTextData=");
        sbE.append(this.d);
        sbE.append(", hookType=");
        sbE.append(this.e);
        sbE.append(", fallbackImage=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
