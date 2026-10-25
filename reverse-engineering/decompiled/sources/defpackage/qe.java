package defpackage;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qe implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19113a;
    public final /* synthetic */ CacheWindowLogic b;
    public final /* synthetic */ CacheWindowScope c;

    public /* synthetic */ qe(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i) {
        this.f19113a = i;
        this.b = cacheWindowLogic;
        this.c = cacheWindowScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19113a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return CacheWindowLogic.getItemSizeOrPrefetch$lambda$4(this.b, this.c, iIntValue, iIntValue2);
            default:
                return CacheWindowLogic.scheduleNextItemIfNeeded$lambda$1(this.b, this.c, iIntValue, iIntValue2);
        }
    }
}
