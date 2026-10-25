package defpackage;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.history.factory.CtaClickedType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19184a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ ChaloUserBookingType.SuperPassBooking c;

    public /* synthetic */ r70(Function2 function2, ChaloUserBookingType.SuperPassBooking superPassBooking, int i) {
        this.f19184a = i;
        this.b = function2;
        this.c = superPassBooking;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19184a) {
            case 0:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            case 1:
                this.b.invoke(this.c, CtaClickedType.VIEW_SUMMARY);
                break;
            case 2:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            case 3:
                this.b.invoke(this.c, CtaClickedType.VIEW_SUMMARY);
                break;
            case 4:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            case 5:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            case 6:
                this.b.invoke(this.c, CtaClickedType.BOOK_AGAIN);
                break;
            case 7:
                this.b.invoke(this.c, CtaClickedType.VIEW_SUMMARY);
                break;
            case 8:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            case 9:
                this.b.invoke(this.c, CtaClickedType.BOOK_AGAIN);
                break;
            case 10:
                this.b.invoke(this.c, CtaClickedType.VIEW_SUMMARY);
                break;
            case 11:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            case 12:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
            default:
                this.b.invoke(this.c, CtaClickedType.BANNER_CTA);
                break;
        }
        return Unit.f17538a;
    }
}
