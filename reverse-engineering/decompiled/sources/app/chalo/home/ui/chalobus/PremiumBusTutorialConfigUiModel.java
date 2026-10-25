package app.chalo.home.ui.chalobus;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialConfigUiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusTutorialConfigUiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3290a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialConfigUiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/ui/chalobus/PremiumBusTutorialConfigUiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusTutorialConfigUiModel> serializer() {
            return PremiumBusTutorialConfigUiModel$$serializer.f3291a;
        }
    }

    public /* synthetic */ PremiumBusTutorialConfigUiModel(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(PremiumBusTutorialConfigUiModel$$serializer.f3291a.getDescriptor(), i, 15);
            throw null;
        }
        this.f3290a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusTutorialConfigUiModel)) {
            return false;
        }
        PremiumBusTutorialConfigUiModel premiumBusTutorialConfigUiModel = (PremiumBusTutorialConfigUiModel) obj;
        return Intrinsics.d(this.f3290a, premiumBusTutorialConfigUiModel.f3290a) && Intrinsics.d(this.b, premiumBusTutorialConfigUiModel.b) && Intrinsics.d(this.c, premiumBusTutorialConfigUiModel.c) && Intrinsics.d(this.d, premiumBusTutorialConfigUiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f3290a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return r30.i(dd.e("PremiumBusTutorialConfigUiModel(videoUrl=", this.f3290a, ", timeStamp=", this.b, ", title="), this.c, ", thumbnailUrl=", this.d, ")");
    }

    public PremiumBusTutorialConfigUiModel(String videoUrl, String timeStamp, String title, String thumbnailUrl) {
        Intrinsics.i(videoUrl, "videoUrl");
        Intrinsics.i(timeStamp, "timeStamp");
        Intrinsics.i(title, "title");
        Intrinsics.i(thumbnailUrl, "thumbnailUrl");
        this.f3290a = videoUrl;
        this.b = timeStamp;
        this.c = title;
        this.d = thumbnailUrl;
    }
}
