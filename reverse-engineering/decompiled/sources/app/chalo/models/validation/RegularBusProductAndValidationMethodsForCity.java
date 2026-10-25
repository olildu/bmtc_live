package app.chalo.models.validation;

import defpackage.nf1;
import defpackage.u01;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/RegularBusProductAndValidationMethodsForCity;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RegularBusProductAndValidationMethodsForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new u01(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5698a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/RegularBusProductAndValidationMethodsForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/RegularBusProductAndValidationMethodsForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RegularBusProductAndValidationMethodsForCity> serializer() {
            return RegularBusProductAndValidationMethodsForCity$$serializer.f5699a;
        }
    }

    public RegularBusProductAndValidationMethodsForCity(int i, String str, List list) {
        this.f5698a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.f17557a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusProductAndValidationMethodsForCity)) {
            return false;
        }
        RegularBusProductAndValidationMethodsForCity regularBusProductAndValidationMethodsForCity = (RegularBusProductAndValidationMethodsForCity) obj;
        return Intrinsics.d(this.f5698a, regularBusProductAndValidationMethodsForCity.f5698a) && Intrinsics.d(this.b, regularBusProductAndValidationMethodsForCity.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5698a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("RegularBusProductAndValidationMethodsForCity(city=", this.f5698a, ", productAndValidationMethods=", ")", this.b);
    }
}
