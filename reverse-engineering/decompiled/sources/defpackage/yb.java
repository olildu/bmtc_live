package defpackage;

import androidx.compose.foundation.BorderKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20093a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yb(Brush brush, long j, long j2, DrawStyle drawStyle) {
        this.d = brush;
        this.b = j;
        this.c = j2;
        this.e = drawStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20093a) {
            case 0:
                return BorderKt.drawRectBorder_NsqcLGU$lambda$0((Brush) this.d, this.b, this.c, (DrawStyle) this.e, (ContentDrawScope) obj);
            default:
                return QuickpayTripAmountDataState.a((QuickpayTripAmountDataState) obj, null, null, (String) this.d, this.b, !((QuickpayTripAmountIntent.ViewCreatedIntent) this.e).b, false, null, this.c, false, null, 867);
        }
    }

    public /* synthetic */ yb(String str, long j, QuickpayTripAmountIntent.ViewCreatedIntent viewCreatedIntent, long j2) {
        this.d = str;
        this.b = j;
        this.e = viewCreatedIntent;
        this.c = j2;
    }
}
