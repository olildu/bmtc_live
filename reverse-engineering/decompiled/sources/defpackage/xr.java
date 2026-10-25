package defpackage;

import androidx.compose.runtime.Composer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class xr {
    public static boolean a(Composer composer, byte b) {
        return composer.changed(b);
    }

    public static boolean b(Composer composer, char c) {
        return composer.changed(c);
    }

    public static boolean c(Composer composer, double d) {
        return composer.changed(d);
    }

    public static boolean d(Composer composer, float f) {
        return composer.changed(f);
    }

    public static boolean e(Composer composer, int i) {
        return composer.changed(i);
    }

    public static boolean f(Composer composer, long j) {
        return composer.changed(j);
    }

    public static boolean g(Composer composer, short s) {
        return composer.changed(s);
    }

    public static boolean h(Composer composer, boolean z) {
        return composer.changed(z);
    }

    public static boolean i(Composer composer, Object obj) {
        return composer.changed(obj);
    }

    public static int j(Composer composer) {
        long compositeKeyHashCode = composer.getCompositeKeyHashCode();
        return (int) (compositeKeyHashCode ^ (compositeKeyHashCode >>> 32));
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void t() {
    }
}
