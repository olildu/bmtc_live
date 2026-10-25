package app.chalo.superpass.data.models.entities;

import app.chalo.models.ProductBranding;
import defpackage.jg1;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassUIProperties;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public class SuperPassUIProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9578a;
    public final List b;
    public final SuperPassUserDetails c;
    public final Map d;
    public final long e;
    public final FareInfo f;
    public final String g;
    public final String h;
    public final ProductBranding i;
    public final String j;
    public final boolean k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassUIProperties$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassUIProperties;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassUIProperties> serializer() {
            return SuperPassUIProperties$$serializer.f9579a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new jg1(11)), null, LazyKt.a(lazyThreadSafetyMode, new jg1(12)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ SuperPassUIProperties(int i, int i2, List list, SuperPassUserDetails superPassUserDetails, Map map, long j, FareInfo fareInfo, String str, String str2, ProductBranding productBranding, String str3, boolean z) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(SuperPassUIProperties$$serializer.f9579a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f9578a = i2;
        this.b = list;
        this.c = superPassUserDetails;
        this.d = map;
        this.e = j;
        this.f = fareInfo;
        this.g = str;
        this.h = str2;
        this.i = productBranding;
        this.j = str3;
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FareInfo getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getK() {
        return this.k;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF9578a() {
        return this.f9578a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final SuperPassUserDetails getC() {
        return this.c;
    }

    public SuperPassUIProperties(int i, List list, SuperPassUserDetails superPassUserDetails, Map map, long j, FareInfo fareInfo, String passName, String categoryName, ProductBranding productBranding, String fareMappingDisplayName, boolean z) {
        Intrinsics.i(passName, "passName");
        Intrinsics.i(categoryName, "categoryName");
        Intrinsics.i(fareMappingDisplayName, "fareMappingDisplayName");
        this.f9578a = i;
        this.b = list;
        this.c = superPassUserDetails;
        this.d = map;
        this.e = j;
        this.f = fareInfo;
        this.g = passName;
        this.h = categoryName;
        this.i = productBranding;
        this.j = fareMappingDisplayName;
        this.k = z;
    }
}
