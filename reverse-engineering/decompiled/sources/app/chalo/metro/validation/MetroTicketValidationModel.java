package app.chalo.metro.validation;

import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/validation/MetroTicketValidationModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketValidationModel implements ProductValidationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroTicketStatus f5564a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final int f;
    public final String g;
    public final Long h;
    public final Long i;
    public final Map j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final List o;

    public MetroTicketValidationModel(MetroTicketStatus status, String str, String str2, long j, Long l, int i, String orderId, Long l2, Long l3, Map map, String str3, String str4, String str5, String str6, List list) {
        Intrinsics.i(status, "status");
        Intrinsics.i(orderId, "orderId");
        this.f5564a = status;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = l;
        this.f = i;
        this.g = orderId;
        this.h = l2;
        this.i = l3;
        this.j = map;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = list;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String a() {
        return "mobileTicket";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String b() {
        return "metroTicket";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final boolean d() {
        MetroTicketStatus metroTicketStatus = MetroTicketStatus.USED;
        MetroTicketStatus metroTicketStatus2 = this.f5564a;
        return metroTicketStatus2 == metroTicketStatus || metroTicketStatus2 == MetroTicketStatus.PUNCHED;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getH() {
        return this.h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: getAmount, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getD() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel
    public final String i() {
        return "Metro Ticket";
    }
}
