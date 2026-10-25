package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzgww;
import com.google.android.gms.internal.atv_ads_framework.zzcv;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class pt1 {
    public static int a(int i, int i2, int i3) {
        return zzcv.zzx(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return zzcv.zzx(i) + i2 + i3 + i4;
    }

    public static IObjectWrapper c(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static Object d(zzbk zzbkVar, int i, List list, int i2) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i2);
    }

    public static void e(Bundle bundle, String str) {
        bundle.putLong(str, zzv.zzC().currentTimeMillis());
    }

    public static void f(String str, String str2, String str3) {
        zzdo.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static int g(int i, int i2, int i3) {
        return zzgww.zzD(i) + i2 + i3;
    }
}
