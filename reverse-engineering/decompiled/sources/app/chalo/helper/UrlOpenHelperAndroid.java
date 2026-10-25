package app.chalo.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/UrlOpenHelperAndroid;", "Lapp/chalo/helper/UrlOpenHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlOpenHelperAndroid implements UrlOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2842a;

    public UrlOpenHelperAndroid(Context context) {
        this.f2842a = context;
    }

    @Override // app.chalo.helper.UrlOpenHelper
    public final boolean a(String url, Map map) {
        Intrinsics.i(url, "url");
        Context context = this.f2842a;
        Intrinsics.i(context, "<this>");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.setFlags(268435456);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        intent.putExtra((String) entry.getKey(), ((Number) value).intValue());
                    } else if (value instanceof String) {
                        intent.putExtra((String) entry.getKey(), (String) value);
                    } else if (value instanceof Float) {
                        intent.putExtra((String) entry.getKey(), ((Number) value).floatValue());
                    } else if (value instanceof Double) {
                        intent.putExtra((String) entry.getKey(), ((Number) value).doubleValue());
                    } else {
                        intent.putExtra((String) entry.getKey(), value.toString());
                    }
                }
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
