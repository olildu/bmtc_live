package app.chalo.validationsdk.blevalidation.ui;

import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/ProductDetailsDisplayData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductDetailsDisplayData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10616a;
    public final ProductDetailsDisplayPassengerFieldData b;
    public final ProductDetailsDisplayFieldData c;
    public final ProductDetailsDisplayFieldData d;
    public final RouteDetailsFieldData e;
    public final String f;
    public final Map g;
    public final String h;
    public final List i;

    public ProductDetailsDisplayData(String expiryTimeInDate, ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData, ProductDetailsDisplayFieldData productDetailsDisplayFieldData, ProductDetailsDisplayFieldData productDetailsDisplayFieldData2, RouteDetailsFieldData routeDetailsFieldData, String str, Map map, String str2, ArrayList arrayList, int i) {
        productDetailsDisplayPassengerFieldData = (i & 2) != 0 ? null : productDetailsDisplayPassengerFieldData;
        productDetailsDisplayFieldData = (i & 4) != 0 ? null : productDetailsDisplayFieldData;
        productDetailsDisplayFieldData2 = (i & 8) != 0 ? null : productDetailsDisplayFieldData2;
        routeDetailsFieldData = (i & 16) != 0 ? null : routeDetailsFieldData;
        str = (i & 32) != 0 ? null : str;
        map = (i & 64) != 0 ? null : map;
        str2 = (i & 128) != 0 ? null : str2;
        arrayList = (i & 256) != 0 ? null : arrayList;
        Intrinsics.i(expiryTimeInDate, "expiryTimeInDate");
        this.f10616a = expiryTimeInDate;
        this.b = productDetailsDisplayPassengerFieldData;
        this.c = productDetailsDisplayFieldData;
        this.d = productDetailsDisplayFieldData2;
        this.e = routeDetailsFieldData;
        this.f = str;
        this.g = map;
        this.h = str2;
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsDisplayData)) {
            return false;
        }
        ProductDetailsDisplayData productDetailsDisplayData = (ProductDetailsDisplayData) obj;
        return Intrinsics.d(this.f10616a, productDetailsDisplayData.f10616a) && Intrinsics.d(this.b, productDetailsDisplayData.b) && Intrinsics.d(this.c, productDetailsDisplayData.c) && Intrinsics.d(this.d, productDetailsDisplayData.d) && Intrinsics.d(this.e, productDetailsDisplayData.e) && Intrinsics.d(this.f, productDetailsDisplayData.f) && Intrinsics.d(this.g, productDetailsDisplayData.g) && Intrinsics.d(this.h, productDetailsDisplayData.h) && Intrinsics.d(this.i, productDetailsDisplayData.i);
    }

    public final int hashCode() {
        int iHashCode = this.f10616a.hashCode() * 31;
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData = this.b;
        int iHashCode2 = (iHashCode + (productDetailsDisplayPassengerFieldData == null ? 0 : productDetailsDisplayPassengerFieldData.hashCode())) * 31;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData = this.c;
        int iHashCode3 = (iHashCode2 + (productDetailsDisplayFieldData == null ? 0 : productDetailsDisplayFieldData.hashCode())) * 31;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData2 = this.d;
        int iHashCode4 = (iHashCode3 + (productDetailsDisplayFieldData2 == null ? 0 : productDetailsDisplayFieldData2.hashCode())) * 31;
        RouteDetailsFieldData routeDetailsFieldData = this.e;
        int iHashCode5 = (iHashCode4 + (routeDetailsFieldData == null ? 0 : routeDetailsFieldData.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.i;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductDetailsDisplayData(expiryTimeInDate=");
        sb.append(this.f10616a);
        sb.append(", passengerDetails=");
        sb.append(this.b);
        sb.append(", field1Data=");
        sb.append(this.c);
        sb.append(", field2Data=");
        sb.append(this.d);
        sb.append(", routeDetails=");
        sb.append(this.e);
        sb.append(", productName=");
        sb.append(this.f);
        sb.append(", passengerTypeCountMap=");
        sb.append(this.g);
        sb.append(", productColoringSchemeHex=");
        sb.append(this.h);
        sb.append(", journey=");
        return xs.l(sb, this.i, ")");
    }
}
