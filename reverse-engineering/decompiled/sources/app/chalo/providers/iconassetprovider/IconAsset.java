package app.chalo.providers.iconassetprovider;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/iconassetprovider/IconAsset;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IconAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8859a;
    public final String b;

    public IconAsset(int i, String str) {
        this.f8859a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconAsset)) {
            return false;
        }
        IconAsset iconAsset = (IconAsset) obj;
        return this.f8859a == iconAsset.f8859a && Intrinsics.d(this.b, iconAsset.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8859a * 31);
    }

    public final String toString() {
        return hq0.d(this.f8859a, "IconAsset(drawableRes=", ", assetName=", this.b, ")");
    }
}
