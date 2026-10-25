package app.chalo.extensions;

import androidx.core.app.NotificationCompat;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/extensions/JsonException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JsonException extends Exception {
    private final String msg;

    public JsonException(String str) {
        super(str);
        this.msg = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsonException) && Intrinsics.d(this.msg, ((JsonException) obj).msg);
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
        return vo1.B("JsonException(msg=", this.msg, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonException(Exception exc, String key) {
        this(z40.g("key: ", key, " - ", exc.getMessage()));
        Intrinsics.i(key, "key");
    }

    public JsonException(int i, Exception exc) {
        this(pk0.g(i, "idx: ", " - ", exc.getMessage()));
    }
}
