package app.chalo.data;

import defpackage.p7;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BackgroundAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BackgroundAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2311a;
    public final BackgroundStyle b;
    public final PaddingAppModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BackgroundAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BackgroundAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BackgroundAppModel> serializer() {
            return BackgroundAppModel$$serializer.f2312a;
        }
    }

    public /* synthetic */ BackgroundAppModel(int i, String str, BackgroundStyle backgroundStyle, PaddingAppModel paddingAppModel) {
        this.f2311a = (i & 1) == 0 ? "00000000" : str;
        if ((i & 2) == 0) {
            this.b = BackgroundStyle.UNKNOWN;
        } else {
            this.b = backgroundStyle;
        }
        if ((i & 4) == 0) {
            this.c = new PaddingAppModel(0, 0, 0, 0);
        } else {
            this.c = paddingAppModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundAppModel)) {
            return false;
        }
        BackgroundAppModel backgroundAppModel = (BackgroundAppModel) obj;
        return Intrinsics.d(this.f2311a, backgroundAppModel.f2311a) && this.b == backgroundAppModel.b && Intrinsics.d(this.c, backgroundAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2311a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BackgroundAppModel(backgroundColor=" + this.f2311a + ", backgroundStyle=" + this.b + ", padding=" + this.c + ")";
    }

    public BackgroundAppModel(String backgroundColor, BackgroundStyle backgroundStyle, PaddingAppModel paddingAppModel) {
        Intrinsics.i(backgroundColor, "backgroundColor");
        Intrinsics.i(backgroundStyle, "backgroundStyle");
        this.f2311a = backgroundColor;
        this.b = backgroundStyle;
        this.c = paddingAppModel;
    }

    public /* synthetic */ BackgroundAppModel() {
        this("00000000", BackgroundStyle.UNKNOWN, new PaddingAppModel(0, 0, 0, 0));
    }
}
