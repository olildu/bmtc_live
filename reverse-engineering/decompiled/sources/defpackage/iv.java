package defpackage;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PositionalDataSource;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iv implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17093a;
    public final /* synthetic */ Function b;

    public /* synthetic */ iv(Function function, int i) {
        this.f17093a = i;
        this.b = function;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f17093a) {
            case 0:
                return DataSource.Factory.map$lambda$1(this.b, (List) obj);
            case 1:
                return ItemKeyedDataSource.map$lambda$7(this.b, (List) obj);
            case 2:
                return PageKeyedDataSource.map$lambda$5(this.b, (List) obj);
            default:
                return PositionalDataSource.map$lambda$4(this.b, (List) obj);
        }
    }
}
