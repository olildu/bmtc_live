package app.cash.sqldelight;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001¨\u0006\u0004"}, d2 = {"Lapp/cash/sqldelight/ColumnAdapter;", "", "T", ExifInterface.LATITUDE_SOUTH, "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ColumnAdapter<T, S> {
    Object a(String str);

    Object encode(Object obj);
}
