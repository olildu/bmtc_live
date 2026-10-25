package defpackage;

import androidx.compose.material3.DatePickerKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15881a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i5(Object obj, long j, int i) {
        this.f15881a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15881a) {
            case 0:
                return AndroidTextPaint.setBrush_12SF9DM$lambda$0((Brush) this.c, this.b);
            case 1:
                return DatePickerKt.Month$lambda$58$lambda$57$lambda$54$lambda$53((Function1) this.c, this.b);
            case 2:
                return Long.valueOf(Http2Connection._init_$lambda$2((Http2Connection) this.c, this.b));
            case 3:
                PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) this.c;
                return Boolean.valueOf((premiumReserveTicketAppModel.c(this.b) || premiumReserveTicketAppModel.f7113a.h == PremiumReserveTicketStatus.USER_CANCELLED || premiumReserveTicketAppModel.d()) ? false : true);
            default:
                return Long.valueOf(RealWebSocket.initReaderAndWriter$lambda$3$lambda$2((RealWebSocket) this.c, this.b));
        }
    }
}
