package app.chalo.ncmc.data.error;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/data/error/UvikInvalidResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UvikInvalidResponseException extends Exception {
    private final String msg;

    public UvikInvalidResponseException() {
        super("Incomplete response from server");
        this.msg = "Incomplete response from server";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UvikInvalidResponseException) && Intrinsics.d(this.msg, ((UvikInvalidResponseException) obj).msg);
    }

    public final int hashCode() {
        String str = this.msg;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return vo1.B("UvikInvalidResponseException(msg=", this.msg, ")");
    }
}
