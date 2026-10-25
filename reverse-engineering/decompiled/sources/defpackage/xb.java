package defpackage;

import app.chalo.bookingsuccess.BookingSuccessDataState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20004a;
    public final /* synthetic */ BookingSuccessDataState b;

    public /* synthetic */ xb(BookingSuccessDataState bookingSuccessDataState, int i) {
        this.f20004a = i;
        this.b = bookingSuccessDataState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BookingSuccessDataState it = (BookingSuccessDataState) obj;
        switch (this.f20004a) {
            case 0:
                Intrinsics.i(it, "it");
                break;
            default:
                Intrinsics.i(it, "it");
                break;
        }
        return this.b;
    }
}
