package app.chalo.home.data.model.api;

import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/ChaloTextDataApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloTextDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundApiModel f2882a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final TextStyleApiModel f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/ChaloTextDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/ChaloTextDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloTextDataApiModel> serializer() {
            return ChaloTextDataApiModel$$serializer.f2883a;
        }
    }

    public /* synthetic */ ChaloTextDataApiModel(int i, BackgroundApiModel backgroundApiModel, String str, Integer num, String str2, Integer num2, TextStyleApiModel textStyleApiModel) {
        if ((i & 1) == 0) {
            this.f2882a = null;
        } else {
            this.f2882a = backgroundApiModel;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = textStyleApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTextDataApiModel)) {
            return false;
        }
        ChaloTextDataApiModel chaloTextDataApiModel = (ChaloTextDataApiModel) obj;
        return Intrinsics.d(this.f2882a, chaloTextDataApiModel.f2882a) && Intrinsics.d(this.b, chaloTextDataApiModel.b) && Intrinsics.d(this.c, chaloTextDataApiModel.c) && Intrinsics.d(this.d, chaloTextDataApiModel.d) && Intrinsics.d(this.e, chaloTextDataApiModel.e) && Intrinsics.d(this.f, chaloTextDataApiModel.f);
    }

    public final int hashCode() {
        BackgroundApiModel backgroundApiModel = this.f2882a;
        int iHashCode = (backgroundApiModel == null ? 0 : backgroundApiModel.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        TextStyleApiModel textStyleApiModel = this.f;
        return iHashCode5 + (textStyleApiModel != null ? textStyleApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloTextDataApiModel(background=");
        sb.append(this.f2882a);
        sb.append(", endIcon=");
        sb.append(this.b);
        sb.append(", endIconTextPadding=");
        gf.w(this.c, ", startIcon=", this.d, ", startIconTextPadding=", sb);
        sb.append(this.e);
        sb.append(", textStyle=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
