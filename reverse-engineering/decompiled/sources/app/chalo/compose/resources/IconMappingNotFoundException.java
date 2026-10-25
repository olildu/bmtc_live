package app.chalo.compose.resources;

import androidx.core.app.NotificationCompat;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/compose/resources/IconMappingNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IconMappingNotFoundException extends Exception {
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconMappingNotFoundException(String msg) {
        super(msg);
        Intrinsics.i(msg, "msg");
        this.msg = msg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IconMappingNotFoundException) && Intrinsics.d(this.msg, ((IconMappingNotFoundException) obj).msg);
    }

    public final int hashCode() {
        return this.msg.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return vo1.B("IconMappingNotFoundException(msg=", this.msg, ")");
    }
}
