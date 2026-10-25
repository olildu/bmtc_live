package app.chalo.universalsearch.data;

import defpackage.ll1;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOptions;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UniversalSearchOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ll1(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f10141a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/universalsearch/data/UniversalSearchOptions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/universalsearch/data/UniversalSearchOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UniversalSearchOptions> serializer() {
            return UniversalSearchOptions$$serializer.f10142a;
        }
    }

    public UniversalSearchOptions(int i, Set set) {
        if ((i & 1) == 0) {
            this.f10141a = EmptySet.f17559a;
        } else {
            this.f10141a = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UniversalSearchOptions) && Intrinsics.d(this.f10141a, ((UniversalSearchOptions) obj).f10141a);
    }

    public final int hashCode() {
        return this.f10141a.hashCode();
    }

    public final String toString() {
        return "UniversalSearchOptions(searchOptions=" + this.f10141a + ")";
    }

    public UniversalSearchOptions(Set searchOptions) {
        Intrinsics.i(searchOptions, "searchOptions");
        this.f10141a = searchOptions;
    }
}
