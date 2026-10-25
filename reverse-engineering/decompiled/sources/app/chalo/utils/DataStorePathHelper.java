package app.chalo.utils;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/DataStorePathHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStorePathHelper {
    public static Path a(Context context, String str) {
        if (!StringsKt.u(str, ".preferences_pb", false)) {
            str = str.concat(".preferences_pb");
        }
        File filesDir = context.getApplicationContext().getFilesDir();
        Intrinsics.h(filesDir, "getFilesDir(...)");
        File fileC = FilesKt.c(filesDir, "datastore");
        if (!fileC.exists()) {
            fileC.mkdirs();
        }
        String str2 = Path.b;
        String absolutePath = FilesKt.c(fileC, str).getAbsolutePath();
        Intrinsics.h(absolutePath, "getAbsolutePath(...)");
        return Path.Companion.a(absolutePath, false);
    }
}
