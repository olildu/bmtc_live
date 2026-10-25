package defpackage;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.google.common.base.Ascii;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d90 {
    public static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String strB = Ascii.b(str);
        return (TextUtils.isEmpty(strB) || (strB.contains("text") && !strB.contains(MimeTypes.TEXT_VTT)) || strB.contains("html") || strB.contains("xml")) ? false : true;
    }
}
