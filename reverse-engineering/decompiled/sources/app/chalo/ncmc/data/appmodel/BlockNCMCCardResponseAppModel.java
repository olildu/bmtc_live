package app.chalo.ncmc.data.appmodel;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/BlockNCMCCardResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BlockNCMCCardResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6117a;

    public BlockNCMCCardResponseAppModel(String str) {
        this.f6117a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockNCMCCardResponseAppModel) && Intrinsics.d(this.f6117a, ((BlockNCMCCardResponseAppModel) obj).f6117a);
    }

    public final int hashCode() {
        String str = this.f6117a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return vo1.B("BlockNCMCCardResponseAppModel(status=", this.f6117a, ")");
    }
}
