package defpackage;

import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19722a;
    public final /* synthetic */ Http2Connection b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ErrorCode d;

    public /* synthetic */ u80(Http2Connection http2Connection, int i, ErrorCode errorCode, int i2) {
        this.f19722a = i2;
        this.b = http2Connection;
        this.c = i;
        this.d = errorCode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19722a) {
            case 0:
                return Http2Connection.writeSynResetLater$lambda$12(this.b, this.c, this.d);
            default:
                return Http2Connection.pushResetLater$lambda$40(this.b, this.c, this.d);
        }
    }
}
