package app.chalo.homescreen.data.model.app;

import app.chalo.data.TextFormatAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.sf;
import defpackage.vo1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusHeaderAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloBusHeaderAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f3723a;
    public final TextFormatAppModel b;
    public final List c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ChaloBusHeaderAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusHeaderAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloBusHeaderAppModel> serializer() {
            return ChaloBusHeaderAppModel$$serializer.f3724a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new sf(19)), LazyKt.a(lazyThreadSafetyMode, new sf(20)), LazyKt.a(lazyThreadSafetyMode, new sf(21)), null, null};
    }

    public ChaloBusHeaderAppModel(int i, IconType iconType, TextFormatAppModel textFormatAppModel, List list, String str, String str2) {
        this.f3723a = (i & 1) == 0 ? null : iconType;
        if ((i & 2) == 0) {
            this.b = new TextFormatAppModel.Simple("");
        } else {
            this.b = textFormatAppModel;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.f17557a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusHeaderAppModel)) {
            return false;
        }
        ChaloBusHeaderAppModel chaloBusHeaderAppModel = (ChaloBusHeaderAppModel) obj;
        return this.f3723a == chaloBusHeaderAppModel.f3723a && Intrinsics.d(this.b, chaloBusHeaderAppModel.b) && Intrinsics.d(this.c, chaloBusHeaderAppModel.c) && Intrinsics.d(this.d, chaloBusHeaderAppModel.d) && Intrinsics.d(this.e, chaloBusHeaderAppModel.e);
    }

    public final int hashCode() {
        IconType iconType = this.f3723a;
        return this.e.hashCode() + nf1.e(r30.b((this.b.hashCode() + ((iconType == null ? 0 : iconType.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloBusHeaderAppModel(icon=");
        sb.append(this.f3723a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tagList=");
        cb0.s(", imageUrl=", this.d, ", fullContentImageUrl=", sb, this.c);
        return vo1.p(sb, this.e, ")");
    }

    public ChaloBusHeaderAppModel(IconType iconType, TextFormatAppModel textFormatAppModel, List tagList, String str) {
        Intrinsics.i(tagList, "tagList");
        this.f3723a = iconType;
        this.b = textFormatAppModel;
        this.c = tagList;
        this.d = str;
        this.e = "";
    }
}
